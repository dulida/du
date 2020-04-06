package com.lida.du.controller;

import com.lida.du.api.IUserService;
import com.lida.du.common.ReMsg;
import com.lida.du.domain.Register;
import com.lida.du.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 杜利达
 * @date: 2020/4/6 19:49
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference(version = "0.0.1")
    private IUserService userService;

    @PostMapping(value = "/register")
    public ReMsg register(@Validated @RequestBody Register register){
        User user = userService.register(register);
        return ReMsg.ok(user);
    }

    @GetMapping(value = "/test")
    public ReMsg test() {
        return ReMsg.ok(null);
    }

}
