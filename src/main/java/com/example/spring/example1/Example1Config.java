package com.example.spring.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example1Config {

    // Object in App memory but not in spring Context
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Mikko");
        return  p;
    }

    @Bean
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return  parrot;
    }


}
