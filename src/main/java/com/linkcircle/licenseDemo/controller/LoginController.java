package com.linkcircle.licenseDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录
 * @author neo
 * @date 2021/10/18
 * @since 1.0.0
 */
@RestController
public class LoginController {

    /**
     * 模拟登录验证
     * @author neo
     * @date 2021/10/18
     * @since 1.0.0
     * @param username 用户名
     * @param password 密码
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @PostMapping("/check")
    @ResponseBody
    public Map<String,Object> test(@RequestParam(required = true) String username, @RequestParam(required = true) String password){
        Map<String,Object> result = new HashMap<>(1);
        System.out.println(MessageFormat.format("用户名：{0}，密码：{1}",username,password));

        //模拟登录
        System.out.println("模拟登录流程");
        result.put("code",200);

        return result;
    }

    /**
     * 用户首页
     * @author neo
     * @date 2021/10/18
     * @since 1.0.0
     * @return java.lang.String
     */
    @RequestMapping("/userIndex")
    public String userIndex(){
        return "userIndex";
    }

}
