package com.example.gradleapp;

import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping("/user")
    public UserSchema createUser(@RequestBody UserSchema user) {
        return userService.createUser(user);
    }

    // READ ALL
    @GetMapping("/users")
    public Collection<UserSchema> getAllUsers() {
        return userService.getAllUsers();
    }

    // READ ONE
    @GetMapping("/user/{id}")
    public UserSchema getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    // UPDATE
    @PutMapping("/user/{id}")
    public UserSchema updateUser(@PathVariable int id, @RequestBody UserSchema user) {
        return userService.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted";
    }
}