package com.gdut.configclient.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@ConfigurationProperties(prefix = "student")
@RefreshScope
public class HelloController {
    private String name;

    private Integer age;

    @RequestMapping("/test")
    public String test() {
        return "{name=" + name + ",age=" + age + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
