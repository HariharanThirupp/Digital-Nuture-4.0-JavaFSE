package com.cognizant.jwtsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/countries")
    public List<String> getCountries() {
        return List.of("India", "USA", "Germany", "Japan");
    }
}
