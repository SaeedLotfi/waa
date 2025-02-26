package com.saeed.waa.services.impl;

import com.saeed.waa.dtos.PostDto;
import com.saeed.waa.entities.Post;
import com.saeed.waa.helpers.ListMapper;
import com.saeed.waa.repos.PostRepo;
import com.saeed.waa.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private ListMapper listMapper;

    @Override
    public List<PostDto> findAll() {
        return listMapper.map(postRepo.findAll(), PostDto.class);
    }

    @Override
    public PostDto findById(int id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public PostDto save(Post post) {
        return modelMapper.map(postRepo.save(post), PostDto.class);
    }
}
