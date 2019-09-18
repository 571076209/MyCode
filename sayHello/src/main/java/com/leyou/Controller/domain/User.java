package com.leyou.Controller.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {


    private int id;

    private String username;

    private int age;

    private List<String> girlFriends;


}
