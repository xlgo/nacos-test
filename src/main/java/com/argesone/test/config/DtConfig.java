package com.argesone.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dyn")
public class DtConfig {

    private String token;  //

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}