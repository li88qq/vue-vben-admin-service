package org.example.controller;

import org.example.dto.BaseResponse;
import org.example.request.LoginForm;
import org.example.service.ILoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登录管理
 */
@RestController
public class LoginController {

    @Resource
    private ILoginService loginService;

    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginForm form) {
        return loginService.login(form);
    }

    @GetMapping("/getUserInfo")
    public BaseResponse getUserInfo(){
        return loginService.getUserInfo();
    }
}
