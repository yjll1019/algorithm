package com.mandalart_server.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("auth")
public class KAuthController {

    @RequestMapping
    public void login(@RequestParam("code") String code) {
        String requestURL = "https://kauth.kakao.com/oauth/token";
        String redirect_uri = "http://localhost:8080/auth";

        List<NameValuePair> nameValuePairs = new ArrayList<>();
        nameValuePairs.add(new BasicNameValuePair("grant_type","authorization_code" ));
        nameValuePairs.add(new BasicNameValuePair("client_id","" ));
        nameValuePairs.add(new BasicNameValuePair("redirect_uri",redirect_uri ));
        nameValuePairs.add(new BasicNameValuePair("code", code ));

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(requestURL);

        JsonNode jsonNode = null;

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = client.execute(httpPost);

            jsonNode = new ObjectMapper().readTree(response.getEntity().getContent());

            System.out.println("토큰: " + jsonNode.get("access_token").toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
