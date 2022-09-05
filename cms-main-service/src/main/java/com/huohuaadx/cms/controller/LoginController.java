package com.huohuaadx.cms.controller;

import com.huohuaadx.api.common.CommonResult;
import com.huohuaadx.cms.model.dto.LoginDTO;
import com.huohuaadx.cms.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 13,2021
 * @desc: //todo
 */
@Slf4j
@Api(tags = "登陆模块管理")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "登陆")
    @PostMapping("/login")
    public CommonResult login(@RequestBody LoginDTO loginDTO) {

        CommonResult commonResult;
        boolean exist = loginService.isExist(loginDTO);
        if (exist) {
            log.info("login success : {}", loginDTO);
            commonResult = CommonResult.success("login success!");
        } else {
            log.error("login failed : {}", loginDTO);
            commonResult = CommonResult.failed("login failed!");
        }
        return commonResult;
    }
}
