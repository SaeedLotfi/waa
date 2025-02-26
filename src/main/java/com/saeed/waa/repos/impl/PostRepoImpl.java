package com.saeed.waa.repos.impl;

import com.saeed.waa.entities.Post;
import com.saeed.waa.repos.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    private static List<Post> posts;
    private static int postId = 300;
    static {
        posts = new ArrayList<>();
        posts.add(new Post(100, "Post 1", "Content 1", "Author 1"));
        posts.add(new Post(200, "Post 2", "Content 2", "Author 2"));
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(int id) {
        return posts
                .stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Post save(Post post) {
        post.setId(postId++);
        posts.add(post);
        return post;
    }
}
