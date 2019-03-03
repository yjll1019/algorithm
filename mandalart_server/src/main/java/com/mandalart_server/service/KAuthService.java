package com.mandalart_server.service;

import com.mandalart_server.model.User;

public interface KAuthService {

    String accessToken(String code);

    User getUser(String access_token);

    void login(User user);
}
