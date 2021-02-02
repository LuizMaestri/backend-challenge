package br.com.mercadoeletronico.testbackend.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public Faker faker(){
        return new Faker();
    }
}
