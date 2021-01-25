package com.springboot.controller;

import com.springboot.dao.UserDatabase;
import com.springboot.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDatabase userDatabase;

    @GetMapping("/loadusers")
    public List<User> getUsers(){
        return userDatabase.getAllUsers();
    }
}
