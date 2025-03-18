package com.kevin.spring.security.controller;

import com.kevin.spring.security.dto.UserDataRequest;
import com.kevin.spring.security.model.UserData;
import com.kevin.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDataRequest userData) {
        UserData savedUser = userService.registerUserData(userData);
        return ResponseEntity.ok(savedUser);
    }
}

