package com.application.bot.session;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import java.io.IOException;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;

@Controller
public class Login {

    private final String HTTP_HEADER_X_APPLICATION = "X-Application";
    private final String HTTP_HEADER_ACCEPT = "Accept";
    private final String HTTP_HEADER_APP_JSON = "application/json";

    public void doLogin() {

        /*
         * -------------------------------------------------------
         * Login a Betfair.it e recupero del SESSION TOKEN
         * -------------------------------------------------------
         */
        this.login();

    }

    private void login() {

        ApiKeyManagement apiKey = ApiKeyManagement.getInstance();

        HashMap<String, String> values = new HashMap<String, String>();
        values.put("username", apiKey.getMyBetfairUsername());
        values.put("password", apiKey.getMyBetfairPassword());

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = new String();
        try {
            requestBody = objectMapper.writeValueAsString(values);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        RequestBody body = RequestBody.create(MediaType.parse(HTTP_HEADER_APP_JSON), requestBody);
        Request request = new Request.Builder()
                .url(apiKey.getBetfairLoginTarget() + "?username=" + apiKey.getMyBetfairUsername() + "&password="
                        + apiKey.getMyBetfairPassword())
                .addHeader(HTTP_HEADER_ACCEPT, HTTP_HEADER_APP_JSON)
                .addHeader(HTTP_HEADER_X_APPLICATION, apiKey.getMyBetfairKey(true))
                .post(body).build();

        OkHttpClient client = new OkHttpClient();
        String responseBody = null;
        try {
            responseBody = client.newCall(request).execute().body().string();
            ObjectMapper mapper = new ObjectMapper();
            UserAuthResponse userAuthResponse = mapper.readValue(responseBody, UserAuthResponse.class);

            apiKey.setSessionToken(userAuthResponse.getToken());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(responseBody);

        if (!apiKey.getSessionToken().equals("")) {
            System.out.println("LOGIN A BETFAIR.IT EFFETTUATO CON SUCCESSO!!");
        }
    }

}
