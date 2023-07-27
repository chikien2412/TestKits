package com.example.testjavaspringbackend.Controller;

import com.example.testjavaspringbackend.Model.posts;
import com.example.testjavaspringbackend.Model.users;
import com.example.testjavaspringbackend.Service.systemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class serviceController {
    @Autowired
    private systemService service;
    //user
    @GetMapping("/user")
    public ResponseEntity<List<users>> getAllUsers(){
        List<users> students = service.getAllUsers();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/register")
    public int InsertUser(@RequestBody users user){
        service.saveUser(user);
        return user.getUser_id();
    }
    //posts
    @GetMapping("/posts")
    public ResponseEntity<List<posts>> getAllPosts(){
        List<posts> posts = service.getAllPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}
