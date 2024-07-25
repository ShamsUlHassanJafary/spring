package com.example.spring.example4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Example4Config {
    @Bean
    public String string(){
        return "Hello";
    }

    @Bean
    public Integer getInteger(){
        return 1;
    }
}
