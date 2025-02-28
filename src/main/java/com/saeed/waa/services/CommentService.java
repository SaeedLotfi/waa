package com.saeed.waa.services;

import com.saeed.waa.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    Comment findById(Long id);
    Comment save(Comment comment);
}
