package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/user/{user_id}")
    public User getUser(@PathVariable("user_id") long id) {
        return userService.getUser(id);
    }

    @GetMapping("/user")
    public User getUser2(@RequestParam("account") long id) {
        return userService.getUser(id);
    }

}
