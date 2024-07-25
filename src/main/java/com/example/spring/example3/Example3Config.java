package com.example.spring.example3;

import com.example.spring.example1.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example3Config {

    @Bean(value = "Ruby")
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("I'm Ruby");
        return  p;
    }

    @Bean(value = "Macy")
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("I am Macy");
        return  p;
    }
}
