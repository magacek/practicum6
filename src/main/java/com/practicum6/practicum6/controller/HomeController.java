package com.practicum6.practicum6.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping
    public String greetings() {
        return "Welcome to the arithmetic service!";
    }
} 