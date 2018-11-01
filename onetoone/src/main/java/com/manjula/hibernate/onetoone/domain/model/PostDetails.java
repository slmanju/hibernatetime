package com.manjula.hibernate.onetoone.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

}
