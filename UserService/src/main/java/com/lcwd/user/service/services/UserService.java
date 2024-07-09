package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    // user Operations

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);
    
}
