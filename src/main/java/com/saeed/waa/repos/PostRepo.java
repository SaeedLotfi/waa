package com.saeed.waa.repos;

import com.saeed.waa.entities.Post;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    Post findById(int id);
    List<Post> findByUserId(Long userId);
    Post save(Post post);
}
