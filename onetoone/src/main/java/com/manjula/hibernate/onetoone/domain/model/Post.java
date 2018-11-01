package com.manjula.hibernate.onetoone.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.manjula.hibernate.onetoone.service.dto.PostDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PostDetails details;

    public static Post instance(String title) {
        return Post.builder().title(title).build();
    }
    
    public PostDTO toDto() {
        return PostDTO.builder().id(id).title(title).build();
    }

    public PostDTO toDetailedDto() {
        return PostDTO.builder().id(id).title(title).details(details.toDto()).build();
    }

}
