package com.example.session.learning.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.session.learning.models.User;
import com.example.session.learning.repository.UserRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")

public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping("/insert")
    public @ResponseBody User postMethodName(@RequestParam String name, @RequestParam String age) {
        User user = new User(name, age);
        userRepository.save(user);
        return user;
    }

}