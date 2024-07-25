package com.example.spring.example6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Example6Config {

    @Bean
    public Cat cat1(){
        Cat cat = new Cat();
        cat.setName("Nova");
        return  cat;
    }

    @Bean
    @Primary
    public Cat cat2(){
        Cat cat = new Cat();
        cat.setName("Penny");
        return  cat;
    }
}
