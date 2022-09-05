package com.huohuaadx.cms.controller;

import com.huohuaadx.api.common.CommonResult;
import com.huohuaadx.cms.common.PageResult;
import com.huohuaadx.cms.model.User;
import com.huohuaadx.cms.holder.LoginUserHolder;
import com.huohuaadx.cms.model.dto.UserDTO;
import com.huohuaadx.cms.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */
@Api(tags = "用户信息管理")
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginUserHolder loginUserHolder;


    @GetMapping("/currentUser")
    public UserDTO currentUser() {
        return loginUserHolder.getCurrentUser();
    }

    @ApiImplicitParam(name = "id", value = "用户ID", required = true)
    @ApiOperation(value = "通过ID获取用户详细信息")
    @GetMapping(value = "/get/{id}")
    public CommonResult<User> getUserById(@PathVariable("id") Long id) {
        return CommonResult.success(userService.getUserById(id));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页数", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, defaultValue = "5")
    })
    @ApiOperation(value = "分页查询用户")
    @GetMapping(value = "/list")
    public CommonResult<PageResult<User>> getUsers(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return CommonResult.success(userService.getUsers(pageNum, pageSize));
    }

    @ApiOperation(value = "修改用户信息")
    @PutMapping(value = "/update")
    public CommonResult updateUser(@RequestBody User user) {
        CommonResult commonResult;
        int i = userService.updateUserById(user);
        if (i == 0) {
            log.error("update failed : {}", user);
            commonResult = CommonResult.failed("user update failed!");
        } else {
            log.info("update success : {}", user);
            commonResult = CommonResult.success(user, "user update success!");
        }
        return commonResult;
    }

    @ApiOperation(value = "删除用户信息")
    @DeleteMapping(value = "/delete/{id}")
    public CommonResult deleteUser(@PathVariable("id") Long id) {
        CommonResult commonResult;
        int i = userService.deleteUserById(id);
        if (i == 0) {
            log.error("user delete failed  id : {}", id);
            commonResult = CommonResult.failed("user delete failed!");
        } else {
            log.info("user delete success id : {}", id);
            commonResult = CommonResult.success(null, "user delete success!");
        }
        return commonResult;
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping(value = "/insert")
    public CommonResult insert(@RequestBody User user) {
        CommonResult commonResult;
        int i = userService.insert(user);
        if (i == 0) {
            log.error("insert failed : {}", user);
            commonResult = CommonResult.failed("user insert failed!");
        } else {
            log.info("insert success : {}", user);
            commonResult = CommonResult.success(user, "user insert success!");
        }
        return commonResult;
    }

}
