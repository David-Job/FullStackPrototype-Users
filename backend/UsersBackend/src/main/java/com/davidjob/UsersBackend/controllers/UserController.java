package com.davidjob.UsersBackend.controllers;

import java.util.List;

import com.davidjob.UsersBackend.entity.models.User;
import com.davidjob.UsersBackend.entity.services.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/api/users")
    private List<User> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/api/users/{id}")
    private User getUser(@PathVariable(name = "id") int id) {
        return userService.getById(id);
    }

    @PostMapping("/api/users")
    private void createUser(User user) {
        userService.create(user);
    }

    @PutMapping("/api/users/{id}")
    private void updateUser(@PathVariable(name = "id") int id, User user) {
        userService.update(id, user);
    }

    @DeleteMapping("/api/users")
    private void deleteUser(User user) {
        userService.delete(user);
    }
    
}
