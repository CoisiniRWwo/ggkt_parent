package com.shf.ggkt.controller;

import com.shf.ggkt.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Su HangFei
 * @Date:2023-03-29 22 45
 * @Project:ggkt_parent
 */
@RestController
@RequestMapping("/admin/vod/user")
@CrossOrigin //跨域
public class UserLoginController {

    //登录
    @PostMapping("login")
    public Result login() {
        Map<String, Object> map = new HashMap<>();
        map.put("token", "admin-token");
        return Result.ok(map);
    }

    //获取用户信息
    @GetMapping("info")
    public Result info() {
        Map<String, Object> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }
}
