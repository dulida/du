package com.lida.du.auth.controller;

import com.lida.du.auth.service.HomeService;
import com.lida.du.common.ReMsg;
import com.lida.du.domain.LoginForm;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: 杜利达
 * @date: 2020/4/5 0:11
 */
@RestController
@RequestMapping(value = "/auth")
public class HomeController {

    @Resource
    private HomeService homeService;

    @PostMapping(value = "/login")
    public ReMsg login(@RequestBody @Validated LoginForm loginForm) {
        return ReMsg.ok(homeService.login(loginForm));
    }

}
