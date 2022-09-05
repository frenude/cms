package com.huohuaadx.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huohuaadx.cms.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */
@Component
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT COUNT(*) FROM `user` WHERE `mail` = #{mail} AND `passwd` = #{passwd}")
    boolean isExistByMail(String mail, String passwd);

    @Select("SELECT COUNT(*) FROM `user` WHERE `name` = #{name} AND `passwd` = #{passwd}")
    boolean isExistByName(String name, String passwd);

    @Select("SELECT COUNT(*) FROM `user` WHERE `mobile` = #{mobile} AND `passwd` = #{passwd}")
    boolean isExistByMobile(String mobile, String passwd);

}
