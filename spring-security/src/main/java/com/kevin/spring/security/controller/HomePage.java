package com.kevin.spring.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @GetMapping("/")
    public String getValue(HttpServletRequest response) {
        return " Hi welcome to homepage " + response.getSession().getId();
    }
}
