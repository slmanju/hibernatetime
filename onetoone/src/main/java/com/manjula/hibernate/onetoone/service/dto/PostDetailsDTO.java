package com.manjula.hibernate.onetoone.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PostDetailsDTO {

    private Long id;
    private String description;

    public static PostDetailsDTO instance(String description) {
        return PostDetailsDTO.builder().description(description).build();
    }

}
