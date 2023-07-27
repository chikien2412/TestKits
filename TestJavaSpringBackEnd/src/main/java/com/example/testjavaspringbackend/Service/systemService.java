package com.example.testjavaspringbackend.Service;

import com.example.testjavaspringbackend.Model.posts;
import com.example.testjavaspringbackend.Model.users;
import com.example.testjavaspringbackend.Repository.postRepository;
import com.example.testjavaspringbackend.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class systemService {
    @Autowired
    private userRepository repository;
    @Autowired
    private postRepository postsRepository;

    //user
    public List<users> getAllUsers()
    {
        return repository.findAll();
    }
    public users saveUser(users user) {
        return repository.save(user);
    }
    //post
    public List<posts> getAllPosts()
    {
        return postsRepository.findAll();
    }

}
