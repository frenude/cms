package com.huohuaadx.cms.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 13,2021
 * @desc: //todo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    @ApiModelProperty(value = "用户邮箱/用户名字/用户手机号")
    private String string;
    @ApiModelProperty(value = "用户密码")
    private String passwd;
}
