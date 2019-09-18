package com.leyou.Controller;

import com.leyou.Controller.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//等于Controller 和respondBody
@Slf4j//日志
public class UserController {
    @Autowired
    private User user;
    @GetMapping("/hello")
    public String sayHello() {
        return "hello spring boot"+user.getGirlFriends().get(1);
    }
    @GetMapping("/hello1")
    public String sayHello1() {
        return "hello spring boot"+user.getGirlFriends().get(1);
    }


}
