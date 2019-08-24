package com.xmut.bookmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.xmut.bookmanage.module.user.entity.User;
import com.xmut.bookmanage.module.user.service.UserService;
import com.xmut.bookmanage.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

/**
 * @description: 登录控制器
 * @author: whf
 * @date: 2019-8-22 21:51:31
 */

// 这个注解是cors跨域的配置
@CrossOrigin
@Controller
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public Object login(@RequestBody JSONObject data) {

        // 对 html 标签进行转义，防止 XSS 攻击
        String username = data.getString("username");
        username = HtmlUtils.htmlEscape(username);
        String password = data.getString("password");

        User user = null;
        try {
            user = userService.findByUsernameAndPassword(username, password);
        } catch (Exception e) {
            return ResponseUtils.loginFail();
        }

        if (null == user) {
            return ResponseUtils.loginFail();
        }

        return ResponseUtils.ok(user);
    }
}
