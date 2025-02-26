package com.saeed.waa.services;

import com.saeed.waa.dtos.PostDto;
import com.saeed.waa.entities.Post;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();
    PostDto findById(int id);
    PostDto save(Post post);
}
