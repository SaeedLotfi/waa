package com.saeed.waa.services;

import com.saeed.waa.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void delete(User user);
    List<User> findUsersByPostsCountGreaterThan(int postCount);
}
