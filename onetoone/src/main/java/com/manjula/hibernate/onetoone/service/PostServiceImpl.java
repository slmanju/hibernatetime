package com.manjula.hibernate.onetoone.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manjula.hibernate.onetoone.domain.model.Post;
import com.manjula.hibernate.onetoone.domain.model.PostDetails;
import com.manjula.hibernate.onetoone.domain.repository.PostRepository;
import com.manjula.hibernate.onetoone.service.dto.PostDTO;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @PostConstruct
    public void init() {
        Post post1 = Post.instance("First Post");
        PostDetails details = PostDetails.instance("first post description", post1);
        post1.setDetails(details);

        postRepository.save(post1);

        Post post2 = Post.instance("Second Post");
        PostDetails details2 = PostDetails.instance("second post description", post2);
        post2.setDetails(details2);

        postRepository.save(post2);
    }

    @Override
    public List<PostDTO> findAll() {
        return postRepository.findAllEagerly().stream()
                .map(Post::toDetailedDto).collect(toList());
    }

    @Override
    public PostDTO findById(Long id) {
        return postRepository.findById(id).map(Post::toDto).orElse(null);
    }

    @Override
    public PostDTO findDetailedById(Long id) {
        return postRepository.findByIdEagerly(id).map(Post::toDetailedDto).orElse(null);
    }

}
