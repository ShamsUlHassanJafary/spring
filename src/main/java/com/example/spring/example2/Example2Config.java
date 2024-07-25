package com.example.spring.example2;

import com.example.spring.example1.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example2Config {

    // could not be registered. A bean with that name has already been defined in class path
//    @Bean
//    public Parrot parrot1(){
//        var p1 = new Parrot();
//        p1.setName("Koko");
//        Parrot p = (Parrot) p1;
//        return p;
//    }

    @Bean
    public Parrot parrot2(){
      Parrot parrot = new Parrot();
        parrot.setName("Miko");
        return parrot;
    }
}
