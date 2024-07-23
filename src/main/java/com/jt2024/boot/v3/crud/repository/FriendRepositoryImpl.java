package com.jt2024.boot.v3.crud.repository;

import com.jt2024.boot.v3.crud.model.Address;
import com.jt2024.boot.v3.crud.model.Friend;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Friend> findById(Integer id) {
        return friends.stream().filter(friend -> friend.getId() == id).findAny();
    }

    @Override
    public Friend save(Friend friend) {
        friend.setId(friends.size() + 1);
        friends.add(friend);
        return friend;
    }

    @Override
    public Friend update(Friend friend) {
        friends.stream().filter(f -> f.getId() == friend.getId()).forEach(f -> {
            f.setFirstName(friend.getFirstName());
            f.setLastName(friend.getLastName());
            f.setAge(friend.getAge());
            f.setMarried(friend.isMarried());
            f.setAddress(friend.getAddress());
        });
        return friend;
    }

    @Override
    public void deleteById(Integer id) {
        friends.removeIf(friend -> friend.getId() == id);
    }

}
