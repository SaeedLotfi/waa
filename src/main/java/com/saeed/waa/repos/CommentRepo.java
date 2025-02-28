package com.saeed.waa.repos;

import com.saeed.waa.entities.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Long> { }
