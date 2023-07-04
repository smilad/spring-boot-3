package com.example.springlem.service;


import com.example.springlem.domain.User;
import com.example.springlem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
