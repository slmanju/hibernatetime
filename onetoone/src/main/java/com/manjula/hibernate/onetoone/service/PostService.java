package com.manjula.hibernate.onetoone.service;

import java.util.List;

import com.manjula.hibernate.onetoone.service.dto.PostDTO;

public interface PostService {

    List<PostDTO> findAll();

    PostDTO findById(Long id);

    PostDTO findDetailedById(Long id);

}
