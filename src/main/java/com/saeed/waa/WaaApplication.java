package com.saeed.waa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WaaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WaaApplication.class, args);

        DataInitializer initializer = context.getBean(DataInitializer.class);
        try { initializer.run(); }
        catch (Exception e) { e.printStackTrace(); }
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
