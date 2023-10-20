package com.example.userDetails_backend.controller;

import com.example.userDetails_backend.model.User;
import com.example.userDetails_backend.service.UserService;
import com.example.userDetails_backend.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @GetMapping("/allUser")
    public List<User> getAllUsers(){
        return userServiceImplementation.allUser();
    }

    @GetMapping("/userById/{userId}")
    public User findUserById(@PathVariable long userId){
        return userServiceImplementation.findUserById(userId);
    }
    @PostMapping("/addUser")
    public User createUser( @RequestBody User user) {
        return userServiceImplementation.createUser(user);
    }






}
