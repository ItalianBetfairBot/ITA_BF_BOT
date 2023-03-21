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

    @Value("${delayedAppKey}")
    private String delayedAppKey;

    @Value("${liveAppKey}")
    private String liveAppKey;

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

}
