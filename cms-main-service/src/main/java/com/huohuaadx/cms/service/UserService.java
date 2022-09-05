package com.huohuaadx.cms.service;

import com.huohuaadx.cms.model.User;
import com.huohuaadx.cms.common.PageResult;
import org.springframework.stereotype.Service;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */
@Service
public interface UserService {
    /**
     * 分页展示list
     *
     * @param pageNum 页数
     * @param size    每页数量
     * @return
     */
    PageResult<User> getUsers(Integer pageNum, Integer size);

    /**
     * 根据id查询user
     *
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUserById(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUserById(Long id);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int insert(User user);
}
