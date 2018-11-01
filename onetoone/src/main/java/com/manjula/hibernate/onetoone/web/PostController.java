package com.manjula.hibernate.onetoone.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manjula.hibernate.onetoone.service.PostService;
import com.manjula.hibernate.onetoone.service.dto.PostDTO;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public List<PostDTO> all() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDTO find(@PathVariable("id") Long id) {
        return postService.findById(id);
    }

    @GetMapping("/details/{id}")
    public PostDTO findDetails(@PathVariable("id") Long id) {
        return postService.findDetailedById(id);
    }

}
