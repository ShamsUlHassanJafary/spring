package com.example.spring.example5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){

        this.name = "Shams"; // Correctly setting the name on the current instance

//        Person person = new Person();
//        person.setName("Shams");
    }
}
