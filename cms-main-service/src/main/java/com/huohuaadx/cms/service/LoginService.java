package com.huohuaadx.cms.service;

import com.huohuaadx.cms.model.dto.LoginDTO;
import org.springframework.stereotype.Service;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 13,2021
 * @desc: //todo
 */

@Service
public interface LoginService {
    boolean isExistByMail(String mail, String passwd);

    boolean isExistByName(String name, String passwd);

    boolean isExistByMobile(String mobile, String passwd);

    boolean isExist(LoginDTO loginDTO);

    boolean isExist(String str, String passwd);
}
