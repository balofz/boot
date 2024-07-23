package com.jt2024.boot.v2.rest.controller;

import com.jt2024.boot.v2.rest.model.Friend;
import com.jt2024.boot.v2.rest.service.FriendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    private final FriendService friendService;

    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friend")
    Iterable<Friend> read(){
        return friendService.findAll();
    }
}
