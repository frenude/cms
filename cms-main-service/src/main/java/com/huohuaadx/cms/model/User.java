package com.huohuaadx.cms.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user")
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "用户ID")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户邮箱")
    private String mail;
    @ApiModelProperty(value = "用户密码")
    private String passwd;
    @ApiModelProperty(value = "用户手机号码")
    private String mobile;
    @ApiModelProperty(value = "用户邮编")
    private Integer pcode;
    @ApiModelProperty(value = "用户地址")
    private String addr;
    @TableLogic
    @JsonIgnore
    private Integer status;

    private static final Long serialVersionUID = 1L;
}
