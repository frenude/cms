package com.huohuaadx.cms.service.impl;

import com.huohuaadx.cms.mapper.UserMapper;
import com.huohuaadx.cms.model.dto.LoginDTO;
import com.huohuaadx.cms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 13,2021
 * @desc: //todo
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean isExistByMail(String mail, String passwd) {
        return userMapper.isExistByMail(mail, passwd);
    }

    @Override
    public boolean isExistByName(String name, String passwd) {
        return userMapper.isExistByName(name, passwd);
    }

    @Override
    public boolean isExistByMobile(String mobile, String passwd) {
        return userMapper.isExistByMobile(mobile, passwd);
    }
    @Override
    public boolean isExist(LoginDTO loginDTO) {
        return isExist(loginDTO.getString(), loginDTO.getPasswd());
    }
    @Override
    public boolean isExist(String str, String passwd) {
        if (isExistByMail(str, passwd) || isExistByName(str, passwd) || isExistByMobile(str, passwd)) {
            return true;
        } else return false;
    }

}
