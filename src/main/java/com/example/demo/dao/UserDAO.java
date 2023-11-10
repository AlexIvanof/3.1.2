package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers ();

    User getUserById(Long id);
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(User user);
}