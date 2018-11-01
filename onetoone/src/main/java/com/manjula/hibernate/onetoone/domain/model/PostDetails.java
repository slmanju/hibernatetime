package com.manjula.hibernate.onetoone.domain.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.manjula.hibernate.onetoone.service.dto.PostDetailsDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "post_details")
public class PostDetails {

    @Id
    private Long id;
    private String description;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Post post;

    public static PostDetails instance(String description, Post post) {
        return PostDetails.builder().description(description).post(post).build();
    }
    
    public PostDetailsDTO toDto() {
        return PostDetailsDTO.builder().id(id).description(description).build();
    }

}
