package com.saeed.waa.repos;

import com.saeed.waa.entities.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
    List<Post> findByTitleContains(String title);
}
