package com.davidjob.UsersBackend.entity.services;

import java.util.List;
import java.util.Optional;

import com.davidjob.UsersBackend.entity.dao.IUserDao;
import com.davidjob.UsersBackend.entity.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    public List<User> getAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
	public User getById(int id) {
		return userDao.findById(id).get();
	}

    @Override
    public void create(User user) {
        userDao.save(user);
    }

    @Override
    public void update(int id, User user) {
        Optional<User> foundUser = userDao.findById(id);
        if (foundUser.isPresent()) {
            user.setId(id);
            userDao.save(user);
        }
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

}