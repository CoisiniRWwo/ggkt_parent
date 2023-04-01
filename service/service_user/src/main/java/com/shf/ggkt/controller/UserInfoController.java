package com.shf.ggkt.controller;

import com.shf.ggkt.model.user.UserInfo;
import com.shf.ggkt.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 16 28
 * @Project:ggkt_parent
 */
@RestController
@RequestMapping("/admin/user/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userService;

    @ApiOperation(value = "获取")
    @GetMapping("inner/getById/{id}")
    public UserInfo getById(@PathVariable Long id) {
        return userService.getById(id);
    }
}
