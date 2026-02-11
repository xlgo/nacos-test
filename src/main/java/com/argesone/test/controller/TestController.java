package com.argesone.test.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.argesone.test.config.DtConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${test}")
    private String test;
    @NacosValue("${test}")
    private String test2; //不能用
    @Autowired
    private DtConfig config;

    @GetMapping("hi")
    public String hi() {
        return "hi! redisPort:" + test + ", test2:" + test2 + ", config.token:" + config.getToken();
    }

}
