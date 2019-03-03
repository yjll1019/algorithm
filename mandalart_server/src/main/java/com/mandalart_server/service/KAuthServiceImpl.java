package com.mandalart_server.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class KAuthServiceImpl implements KAuthService {

    public String accessToken(String code) {
        String requestURL = "https://kauth.kakao.com/oauth/token";
        String redirect_uri = "http://localhost:8080/auth";

        List<NameValuePair> nameValuePairs =
                Arrays.asList(
                    new BasicNameValuePair("grant_type","authorization_code"),
                    new BasicNameValuePair("client_id",""),
                    new BasicNameValuePair("redirect_uri",redirect_uri),
                    new  BasicNameValuePair("code",code)
                );

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(requestURL);

        JsonNode jsonNode = null;
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

    public void getUserInfo(String access_token) {
        String requestURL = "https://kapi.kakao.com/v2/user/me";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(requestURL);

        JsonNode jsonNode = null;

        try{

            httpGet.setHeader("Authorization", "Bearer " + access_token);
            HttpResponse response = client.execute(httpGet);

            jsonNode = new ObjectMapper().readTree(response.getEntity().getContent());

            String id = jsonNode.get("id").asText();
            String nickname = jsonNode.get("properties").get("nickname").textValue();
            String email = jsonNode.get("kakao_account").get("email").textValue();

            System.out.println("id: " + id);
            System.out.println("nickname: " + nickname);
            System.out.println("email: " + email);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
