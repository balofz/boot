package com.jt2024.boot.v1.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, friend!";
    }

}
