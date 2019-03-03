package com.mandalart_server.controller;

import com.mandalart_server.model.User;
import com.mandalart_server.service.KAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class KAuthController {

    @Autowired
    KAuthService kAuthService;

    @RequestMapping
    public void login(@RequestParam("code") String code) {

        User user = kAuthService.getUser(kAuthService.accessToken(code));
        kAuthService.login(user);

    }

}
