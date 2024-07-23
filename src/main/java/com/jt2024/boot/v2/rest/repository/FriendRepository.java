package com.jt2024.boot.v2.rest.repository;

import com.jt2024.boot.v2.rest.model.Friend;

import java.util.List;

public interface FriendRepository {

    List<Friend> findAll();
}
