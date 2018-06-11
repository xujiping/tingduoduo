package com.mall.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页欢迎页面
 * @author xujiping
 * @date 2018/6/11 14:49
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("")
    public String welcome(){
        return "welcome";
    }
}
