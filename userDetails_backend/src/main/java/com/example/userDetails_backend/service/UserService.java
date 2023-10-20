package com.example.userDetails_backend.service;

import com.example.userDetails_backend.model.Plan;
import com.example.userDetails_backend.model.User;

import java.util.List;

public interface UserService {
    List<User> allUser();

    User createUser(User user);

    User findUserById(long userId);
}
