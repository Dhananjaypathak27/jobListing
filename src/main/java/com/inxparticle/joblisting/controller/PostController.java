package com.inxparticle.joblisting.controller;

import com.inxparticle.joblisting.repository.PostRepository;
import com.inxparticle.joblisting.model.Post;
import com.inxparticle.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    SearchRepository sRepo;

    @Autowired
    PostRepository repo;

    @GetMapping("/")
    public String  getRoot(){
        return "hello world is here";
    }

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return repo.findAll();
    }


    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return sRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

//    public List<Post> searchPosts(@RequestBody String key){
//        return repo.
//    }
}
