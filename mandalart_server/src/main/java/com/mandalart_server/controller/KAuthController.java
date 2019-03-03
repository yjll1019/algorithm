package com.mandalart_server.controller;

import com.mandalart_server.service.KAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class KAuthController {

    @Autowired
    KAuthService kAuthService;

    @RequestMapping
    public void getUserInfo(@RequestParam("code") String code) {

        kAuthService.getUserInfo(kAuthService.accessToken(code));
        /* 출력 예시
        *  id: 123456789
        *  nickname: 홍길동
        *  email: xxxxxxx@xxxx.com
        * */
    }

}
