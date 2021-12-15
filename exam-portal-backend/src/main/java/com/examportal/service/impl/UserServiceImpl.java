package com.examportal.service.impl;

import com.examportal.model.User;
import com.examportal.model.UserRole;
import com.examportal.repo.RoleRepo;
import com.examportal.repo.UserRepo;
import com.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
   private RoleRepo roleRepo;


    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = userRepo.findByUsername(user.getUsername());
        if(local!=null){
            System.out.println("User already exists");
            throw new Exception("User already exists");
        }
        else{
            //create user
            for(UserRole ur:userRoles){
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepo.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepo.findByUsername(username);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
