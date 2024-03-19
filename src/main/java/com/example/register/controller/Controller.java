package com.example.register.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.register.model.User;
import com.example.register.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/home")

public class Controller {
    @Autowired
    private UserService user;

    @GetMapping("/users")
    public List<User> get() {
        return user.getSet();
    }

}
