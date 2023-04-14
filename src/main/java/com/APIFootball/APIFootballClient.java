package com.APIFootball;

import java.io.IOException;

import com.application.bot.session.ApiKeyManagement;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class APIFootballClient {

    private static final OkHttpClient client = new OkHttpClient();

    public static synchronized Response getRapidApiResponse(String parameters) {

        ApiKeyManagement apiKey = ApiKeyManagement.getInstance();

        Request request = new Request.Builder()
                .url("https://api-football-v1.p.rapidapi.com/v3/" + parameters)
                .get()
                .addHeader("x-rapidapi-host", apiKey.getMyRapidApiHost())
                .addHeader("x-rapidapi-key", apiKey.getMyRapidApiKey())
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }
}
