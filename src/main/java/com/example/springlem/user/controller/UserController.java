package com.example.springlem.user.controller;


import com.example.springlem.user.domain.User;
import com.example.springlem.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/str")
    public String MiliTest() {
        return "hi";
    }

    @GetMapping("/user")
    public List<User> GetUsers() {
        return this.userService.GetAllUser();
    }
}
