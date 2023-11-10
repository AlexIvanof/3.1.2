package com.example.demo.service;


import com.example.demo.model.User;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(Long id);
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(@Valid User user);
}