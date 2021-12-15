package com.examportal;

import com.examportal.model.Role;
import com.examportal.model.User;
import com.examportal.model.UserRole;
import com.examportal.service.UserService;
import com.examportal.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamPortalBackendApplication {

//    @Autowired
//    private UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(ExamPortalBackendApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Starting");
//        User user1 = new User();
//
//        user1.setFirstName("Saran");
//        user1.setLastName("Ghimire");
//        user1.setEmail("saran@gmail.com");
//        user1.setPassword("4657223");
//        user1.setUsername("don");
//
//        Role role1 = new Role();
//        role1.setRoleId(13L);
//        role1.setRoleName("USER");
//
//        Set<UserRole> userRoleSet = new HashSet<>();
//        UserRole userRole = new UserRole();
//        userRole.setRole(role1);
//        userRole.setUser(user1);
//        userRoleSet.add(userRole);
//
//        User user2 = userService.createUser(user1, userRoleSet);
//        System.out.println(user2.getEmail());
//    }
}
