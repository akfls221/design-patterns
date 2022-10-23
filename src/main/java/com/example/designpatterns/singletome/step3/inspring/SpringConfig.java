package com.example.designpatterns.singletome.step3.inspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean
    public String hello() {
        return "Hello";
    }
}
