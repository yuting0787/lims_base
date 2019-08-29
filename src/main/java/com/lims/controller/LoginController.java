package com.lims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制器
 */
@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping({ "/", "" })
    String welcome(Model model) {

        return "redirect:/login";
    }

    @GetMapping("/login")
    String login() {
        return "test";
    }


}
