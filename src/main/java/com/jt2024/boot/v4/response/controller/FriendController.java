package com.jt2024.boot.v4.response.controller;

import com.jt2024.boot.v4.response.model.Friend;
import com.jt2024.boot.v4.response.service.FriendService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/friend/{id}")
    Optional<Friend> findById(@PathVariable Integer id){
        return friendService.findById(id);
    }

    @PostMapping("/friend")
    Friend create(@RequestBody Friend friend) {
        return friendService.save(friend);
    }

    @PutMapping("/friend")
    ResponseEntity<Friend> update(@RequestBody Friend friend){
        if (friendService.findById(friend.getId()).isPresent()) {
            return ResponseEntity.ok(friendService.save(friend));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(friend);
        }
    }

    @DeleteMapping("/friend/{id}")
    void delete(@PathVariable Integer id){
        friendService.deleteById(id);
    }
}
