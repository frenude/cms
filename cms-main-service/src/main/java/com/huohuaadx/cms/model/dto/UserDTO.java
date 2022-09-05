package com.huohuaadx.cms.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 08 02,2021
 * @desc: //todo
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private List<String> roles;
}