package com.saeed.waa.controllers;

import com.saeed.waa.dtos.PostDto;
import com.saeed.waa.entities.Post;
import com.saeed.waa.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public List<PostDto> getAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDto getById(@PathVariable("id") int id) {
        return postService.findById(id);
    }

    @PostMapping
    public PostDto create(@RequestBody PostDto post) {
        return postService.save(mapper.map(post, Post.class));
    }
}
