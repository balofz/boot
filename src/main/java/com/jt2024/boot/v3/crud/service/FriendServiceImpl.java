package com.jt2024.boot.v3.crud.service;

import com.jt2024.boot.v3.crud.model.Friend;
import com.jt2024.boot.v3.crud.repository.FriendRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendServiceImpl implements FriendService {

    private final FriendRepository friendRepository;

    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @Override
    public List<Friend> findAll() {
        return friendRepository.findAll();
    }

    @Override
    public Optional<Friend> findById(Integer id) {
        return friendRepository.findById(id);
    }

    @Override
    public Friend save(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public Friend update(Friend friend) {
        return friendRepository.update(friend);
    }

    @Override
    public void deleteById(Integer id) {
        friendRepository.deleteById(id);
    }
}
