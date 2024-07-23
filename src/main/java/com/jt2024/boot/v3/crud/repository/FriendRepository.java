package com.jt2024.boot.v3.crud.repository;

import com.jt2024.boot.v3.crud.model.Friend;

import java.util.List;
import java.util.Optional;

public interface FriendRepository {

    List<Friend> findAll();

    Optional<Friend> findById(Integer id);

    Friend save(Friend friend);

    Friend update(Friend friend);

    void deleteById(Integer id);

}
