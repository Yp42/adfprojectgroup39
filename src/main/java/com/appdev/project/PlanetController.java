package com.appdev.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {
    @GetMapping("/")
    public String root() {
        return "Hello, World!";
    }
}