package com.sh.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {
    
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }

    //自定义消息转化器，spring boot 默认是utf-8
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter  = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}