package com.davidjob.UsersBackend.entity.services;

import java.util.List;

import com.davidjob.UsersBackend.entity.models.User;

/**
 * IUserService
 */
public interface IUserService {

    // CRUD methods
    public List<User> getAll();

    public User getById(int id);

    public void create(User user);

    public void update(int id, User user);

    public void delete(User user);

}