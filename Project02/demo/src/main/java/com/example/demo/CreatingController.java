package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatingController {
    @RequestMapping("/greeting")
    public String getGreeting() {
        return "Hello World!";
    }
}
