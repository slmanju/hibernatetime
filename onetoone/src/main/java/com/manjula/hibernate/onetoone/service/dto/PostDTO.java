package com.manjula.hibernate.onetoone.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PostDTO {

    private Long id;
    private String title;
    private PostDetailsDTO details;

    public static PostDTO instance(String title) {
        return PostDTO.builder().title(title).build();
    }

}
