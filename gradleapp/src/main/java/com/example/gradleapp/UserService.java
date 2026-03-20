package com.example.gradleapp;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    private final Map<Integer, UserSchema> users = new HashMap<>();
    private int currentId = 1;

    // CREATE
    public UserSchema createUser(UserSchema user) {
        user.setId(currentId++);
        users.put(user.getId(), user);
        return user;
    }

    // READ ALL
    public Collection<UserSchema> getAllUsers() {
        return users.values();
    }

    // READ ONE
    public UserSchema getUser(int id) {
        return users.get(id);
    }

    // UPDATE
    public UserSchema updateUser(int id, UserSchema updatedUser) {
        if (users.containsKey(id)) {
            updatedUser.setId(id);
            users.put(id, updatedUser);
            return updatedUser;
        }
        return null;
    }

    // DELETE
    public void deleteUser(int id) {
        users.remove(id);
    }
}