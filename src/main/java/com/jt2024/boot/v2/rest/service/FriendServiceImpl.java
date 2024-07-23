package com.jt2024.boot.v2.rest.service;

import com.jt2024.boot.v2.rest.model.Friend;
import com.jt2024.boot.v2.rest.repository.FriendRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService{

    private final FriendRepository friendRepository;

    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @Override
    public List<Friend> findAll() {
        return friendRepository.findAll();
    }
}
