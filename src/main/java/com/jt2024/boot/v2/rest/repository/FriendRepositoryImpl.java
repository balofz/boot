package com.jt2024.boot.v2.rest.repository;

import com.jt2024.boot.v2.rest.model.Address;
import com.jt2024.boot.v2.rest.model.Friend;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FriendRepositoryImpl implements FriendRepository {

    public List<Friend> friends;

    public FriendRepositoryImpl() {
        friends = new ArrayList<>();
        final Address address1 = new Address(1, "123 Main St", "Springfield");
        final Friend friend1 = new Friend(1, "John", "Doe", 30, true, address1);
        friends.add(friend1);

        final Address address2 = new Address(2, "Lincoln St", "Gotham");
        final Friend friend2 = new Friend(2, "Jane", "Doe", 25, false, address2);
        friends.add(friend2);
    }

    public List<Friend> findAll() {
        return friends;
    }

}
