package com.example.springlem.controller;


import com.example.springlem.domain.User;
import com.example.springlem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
