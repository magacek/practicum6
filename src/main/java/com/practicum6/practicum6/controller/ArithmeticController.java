package com.practicum6.practicum6.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicum6.practicum6.service.ArithmeticService;

@RestController
@CrossOrigin
@RequestMapping("/add")
public class ArithmeticController {

    private final ArithmeticService arithmeticService;

    public ArithmeticController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m) {
        return arithmeticService.add(n, m);
    }
} 