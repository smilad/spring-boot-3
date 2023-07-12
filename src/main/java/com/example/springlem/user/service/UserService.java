package com.example.springlem.user.service;


import com.example.springlem.user.domain.User;
import com.example.springlem.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> GetAllUser() {
        return this.userRepository.findAll();
    }

}
