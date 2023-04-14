package com.betfair.aping.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import com.application.bot.session.ApiKeyManagement;
import com.betfair.aping.enums.ApiNgOperation;
//import com.betfair.aping.ApiNGDemo;
import com.betfair.aping.exceptions.APINGException;
import com.betfair.aping.util.JsonResponseHandler;
import com.betfair.aping.util.RescriptResponseHandler;

public class HttpUtil {

    private final String HTTP_HEADER_X_APPLICATION = "X-Application";
    private final String HTTP_HEADER_X_AUTHENTICATION = "X-Authentication";
    private final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    private final String HTTP_HEADER_ACCEPT = "Accept";
    private final String HTTP_HEADER_ACCEPT_CHARSET = "Accept-Charset";
    private String resp = null;
    private ApiKeyManagement apiKey = ApiKeyManagement.getInstance();

    public HttpUtil() {
        super();
    }

    private String sendPostRequest(String param, String operation, String appKey, String ssoToken, String URL,
            ResponseHandler<String> reqHandler) {
        // String jsonRequest = param;

        int readTimeout = 18;
        int writeTimeout = 18;
        int connectTimeout = 18;

        if (operation.equals(ApiNgOperation.LISTRUNNERBOOK.getOperationName())) {
            readTimeout = 10;
            writeTimeout = 10;
            connectTimeout = 10;
        } else if (operation.equals(ApiNgOperation.PLACORDERS.getOperationName())) {
            readTimeout = 60;
            writeTimeout = 60;
            connectTimeout = 60;
        }

        try {

            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            OkHttpClient httpClient = new OkHttpClient()
                    .newBuilder()
                    .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                    .readTimeout(readTimeout, TimeUnit.SECONDS)
                    .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                    .build();

            RequestBody body = RequestBody.create(JSON, param);
            Request request = new Request.Builder()
                    .addHeader(HTTP_HEADER_CONTENT_TYPE, "application/json")
                    .addHeader(HTTP_HEADER_ACCEPT, "application/json")
                    .addHeader(HTTP_HEADER_ACCEPT_CHARSET, "UTF-8")
                    .addHeader(HTTP_HEADER_X_APPLICATION, apiKey.getMyBetfairKey(true))
                    .addHeader(HTTP_HEADER_X_AUTHENTICATION, ssoToken)
                    .url(URL)
                    .post(body)
                    .build();

            Response response = httpClient.newCall(request).execute();

            resp = response.body().string();

        } catch (UnsupportedEncodingException e1) {
            // e1.printStackTrace();
            System.out.println("E1 " + e1.getMessage());

        } catch (ClientProtocolException e) {
            // e.printStackTrace();
            System.out.println("E2 " + e.getMessage());

        } catch (IOException ioE) {
            // ioE.printStackTrace();
            System.out.println("E3 - " + operation + " - " + ioE.getMessage());

        }

        return resp;

    }

    public String sendPostRequestRescript(String param, String operation, String appKey, String ssoToken)
            throws APINGException {
        String apiNgURL = "https://api.betfair.it/exchange/betting/rest/v1.0/" + operation + "/";

        return sendPostRequest(param, operation, appKey, ssoToken, apiNgURL, new RescriptResponseHandler());

    }

    public String sendAccountPostRequestRescript(String param, String operation, String appKey, String ssoToken)
            throws APINGException {
        String apiNgURL = "https://api.betfair.it/exchange/account/rest/v1.0/" + operation + "/";

        return sendPostRequest(param, operation, appKey, ssoToken, apiNgURL, new RescriptResponseHandler());

    }

    public String sendPostRequestJsonRpc(String param, String operation, String appKey, String ssoToken) {
        String apiNgURL = "https://api.betfair.it/exchange/betting/json-rpc/v1";

        return sendPostRequest(param, operation, appKey, ssoToken, apiNgURL, new JsonResponseHandler());

    }

}
