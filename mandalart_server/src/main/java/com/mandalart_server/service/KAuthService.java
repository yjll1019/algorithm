package com.mandalart_server.service;

public interface KAuthService {

    String accessToken(String code);

    void getUserInfo(String access_token);

}
