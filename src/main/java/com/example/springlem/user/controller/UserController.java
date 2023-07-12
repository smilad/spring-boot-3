package com.example.springlem.user.controller;


import com.example.springlem.user.domain.User;
import com.example.springlem.user.dto.CreateUserRequestDTO;
import com.example.springlem.user.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/user")
    public ResponseEntity<?> CreateUser(@Valid @RequestBody CreateUserRequestDTO dto) {
        System.out.println(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body("user created");
    }
}
