package com.saeed.waa.services.impl;

import com.saeed.waa.entities.User;
import com.saeed.waa.repos.UserRepo;
import com.saeed.waa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return (List<User>) this.userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepo.findById(id).get();
    }

    @Override
    public User save(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public void delete(User user) {
        this.userRepo.delete(user);
    }

    @Override
    public List<User> findUsersByPostsCountGreaterThan(int postCount) {
        return this.userRepo.findUsersByPostsCountGreaterThan(postCount);
    }
}
