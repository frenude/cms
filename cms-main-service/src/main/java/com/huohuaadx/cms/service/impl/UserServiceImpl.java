package com.huohuaadx.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huohuaadx.cms.mapper.UserMapper;
import com.huohuaadx.cms.model.User;
import com.huohuaadx.cms.common.PageResult;
import com.huohuaadx.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //用户的CURD
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult<User> getUsers(Integer pageNum, Integer pageSize) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = Wrappers.lambdaQuery();
        userLambdaQueryWrapper.eq(User::getStatus, 0);
        Page<User> userPage = userMapper.selectPage(new Page<>(pageNum, pageSize), userLambdaQueryWrapper);
        return PageResult.pageToPageResult(userPage);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateUserById(User user) {

        return userMapper.updateById(user);
    }

    @Override
    public int deleteUserById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
