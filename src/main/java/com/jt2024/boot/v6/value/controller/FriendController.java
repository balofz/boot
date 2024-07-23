package com.jt2024.boot.v6.value.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    @Value("${custom.greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public String greeting() {
        return greeting;
    }

}
