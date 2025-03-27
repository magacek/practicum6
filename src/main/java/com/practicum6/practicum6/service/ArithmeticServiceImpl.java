package com.practicum6.practicum6.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticServiceImpl implements ArithmeticService {
    
    @Override
    public int add(int n, int m) {
        return n + m;
    }
} 