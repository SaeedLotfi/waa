package com.saeed.waa.controllers;

import com.saeed.waa.dtos.PostDto;
import com.saeed.waa.entities.User;
import com.saeed.waa.services.PostService;
import com.saeed.waa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @GetMapping
    public List<User> findAll() {
        return this.userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.userService.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return this.userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<PostDto> findAllPosts(@PathVariable("id") Long id) {
        return this.postService.findByUserId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        User user = this.userService.findById(id);
        this.userService.delete(user);
    }
}
