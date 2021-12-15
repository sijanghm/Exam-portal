package com.examportal.service;

import com.examportal.model.User;
import com.examportal.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating the user
    public User createUser(User user, Set<UserRole> userRole) throws Exception;

    //get user by user name
    public User getUser(String username);

    //delete user by username

    public void deleteUser(Long id);
}
