package com.saeed.waa.services;

import com.saeed.waa.dtos.PostDto;
import com.saeed.waa.entities.Post;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();
    PostDto findById(Long id);
    List<PostDto> findByUserId(Long userId);
    PostDto save(Post post);
    List<PostDto> findByTitleContains(String title);
}
