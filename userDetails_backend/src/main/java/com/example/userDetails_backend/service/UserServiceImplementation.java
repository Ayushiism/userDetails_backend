package com.example.userDetails_backend.service;

import com.example.userDetails_backend.exception.ResourceNotFoundException;
import com.example.userDetails_backend.model.Plan;
import com.example.userDetails_backend.model.User;
import com.example.userDetails_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PlanServiceImplementation planServiceImplementation;
    @Override
    public List<User> allUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User findUserById(long userId) {
        User user = userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("user not Exit with id "+userId));

        Plan plan = planServiceImplementation.getPlanById(user.getPId());
       user.setPlan(plan);
       return user;
    }

}
