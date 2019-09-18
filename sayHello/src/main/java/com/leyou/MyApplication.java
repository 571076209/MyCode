package com.leyou;

import com.leyou.Controller.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//
public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MyApplication.class, args);
    }
}
