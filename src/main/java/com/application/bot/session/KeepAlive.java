package com.application.bot.session;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

@Configuration
@EnableAsync
@EnableScheduling
public class KeepAlive {

    private final String HTTP_HEADER_X_APPLICATION = "X-Application";
    private final String HTTP_HEADER_X_AUTHENTICATION = "X-Authentication";
    private final String HTTP_HEADER_ACCEPT = "Accept";
    private final String HTTP_HEADER_APP_JSON = "application/json";
    private final String keepAliveTarget = "https://identitysso.betfair.it/api/keepAlive";

    ApiKeyManagement apiKey = ApiKeyManagement.getInstance();

    @Scheduled(fixedRate = 60000)
    public void sendKeepAlive() {

        if (!apiKey.getSessionToken().equals("")) {

            RequestBody body = RequestBody.create(MediaType.parse(HTTP_HEADER_APP_JSON), "");
            Request request = new Request.Builder().url(keepAliveTarget)
                    .addHeader(HTTP_HEADER_ACCEPT, HTTP_HEADER_APP_JSON)
                    .addHeader(HTTP_HEADER_X_APPLICATION, apiKey.getMyBetfairKey(true))
                    .addHeader(HTTP_HEADER_X_AUTHENTICATION, apiKey.getSessionToken())
                    .post(body).build();

            OkHttpClient client = new OkHttpClient();
            String responseBody = "";
            try {
                responseBody = client.newCall(request).execute().body().string();
                // System.out.println("keep alive: " + responseBody);
                ObjectMapper mapper = new ObjectMapper();
                UserAuthResponse userAuthResponse = mapper.readValue(responseBody, UserAuthResponse.class);

                if (!userAuthResponse.getStatus().equalsIgnoreCase("SUCCESS")) {                   
                    new Login().doLogin();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            new Login().doLogin();
        }
    }

}
