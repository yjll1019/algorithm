package com.mandalart_server.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mandalart_server.dao.UserRepository;
import com.mandalart_server.model.User;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class KAuthServiceImpl implements KAuthService {

    @Autowired
    UserRepository userRepository;

    public String accessToken(String code) {
        String requestURL = "https://kauth.kakao.com/oauth/token";
        String redirect_uri = "http://localhost:8080/auth";

        List<NameValuePair> nameValuePairs =
                Arrays.asList(
                    new BasicNameValuePair("grant_type","authorization_code"),
                    new BasicNameValuePair("client_id","e98d07c15da32c585ce345d351672567"),
                    new BasicNameValuePair("redirect_uri",redirect_uri),
                    new  BasicNameValuePair("code",code)
                );

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(requestURL);

        JsonNode jsonNode;
        String access_token = "";

        try {

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = client.execute(httpPost);

            jsonNode = new ObjectMapper().readTree(response.getEntity().getContent());
            access_token = jsonNode.get("access_token").toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return access_token;
    }

    public User getUser(String access_token) {
        String requestURL = "https://kapi.kakao.com/v2/user/me";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(requestURL);

        JsonNode jsonNode;
        User user = new User();

        try{

            httpGet.setHeader("Authorization", "Bearer " + access_token);
            HttpResponse response = client.execute(httpGet);

            jsonNode = new ObjectMapper().readTree(response.getEntity().getContent());

            user.setUserId(jsonNode.get("id").asText());
            user.setEmail(jsonNode.get("kakao_account").get("email").textValue());
            user.setNickname(jsonNode.get("properties").get("nickname").textValue());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    public void login(User user){

        User u = userRepository.findByUserId(user.getUserId());

        if(u == null) {
            userRepository.save(user);
            /* 토큰 부여 */
        }

        /* 토큰 부여 */
    }

}
