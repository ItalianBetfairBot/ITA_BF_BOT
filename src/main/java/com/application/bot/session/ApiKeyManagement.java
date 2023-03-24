package com.application.bot.session;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ApiKeyManagement {

    private String sessionToken="";
   
    private static ApiKeyManagement instance = new ApiKeyManagement();

    private Properties appProps = new Properties();
    private InputStream ioStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream("application.properties");

    public ApiKeyManagement() {
        try {
            appProps.load(ioStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ApiKeyManagement getInstance() {
        return instance;
    }

    public String getMyBetfairKey(boolean isDelayed) {
        return isDelayed ? appProps.getProperty("delayedAppKey") : appProps.getProperty("liveAppKey");

    }

    public String getBetfairLoginTarget() {
      return appProps.getProperty("loginTarget");
    }

    public String getBetfairKeepAliveTarget() {
        return appProps.getProperty("keepAliveTarget");
      }

      public String getBetfairCurrency() {
        return appProps.getProperty("currency");
      }


    public String getMyBetfairUsername() {
        return appProps.getProperty("username");
    }

    public String getMyBetfairPassword() {
        return appProps.getProperty("password");
    }

    public String getMyRapidApiHost() {
        return appProps.getProperty("rapidApiHost");
    }

    public String getMyRapidApiKey() {
        return appProps.getProperty("rapidApiKey");
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

}
