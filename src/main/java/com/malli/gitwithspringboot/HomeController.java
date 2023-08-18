package com.malli.gitwithspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Git with Spring Boot";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Git with Spring Boot";
    }

    @GetMapping("/hello123")
    public String hello123() {
        return "Hello123, Git with Spring Boot";
    }

    @GetMapping("/hello153")
    public String hello153() {
        return "Hello153, Git with Spring Boot";
    }


}
