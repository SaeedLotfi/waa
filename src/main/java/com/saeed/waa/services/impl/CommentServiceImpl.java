package com.saeed.waa.services.impl;

import com.saeed.waa.entities.Comment;
import com.saeed.waa.repos.CommentRepo;
import com.saeed.waa.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) this.commentRepo.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return this.commentRepo.findById(id).orElse(null);
    }

    @Override
    public Comment save(Comment comment) {
        return this.commentRepo.save(comment);
    }
}
