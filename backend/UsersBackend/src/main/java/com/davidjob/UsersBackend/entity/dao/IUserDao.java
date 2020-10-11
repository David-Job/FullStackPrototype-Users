package com.davidjob.UsersBackend.entity.dao;

import com.davidjob.UsersBackend.entity.models.User;

import org.springframework.data.repository.CrudRepository;

/**
 * IUserDao
 */
public interface IUserDao extends CrudRepository<User, Integer> {
    
}