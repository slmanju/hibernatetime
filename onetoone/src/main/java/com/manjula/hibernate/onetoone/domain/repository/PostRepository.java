package com.manjula.hibernate.onetoone.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manjula.hibernate.onetoone.domain.model.Post;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select post from OneToOnePost post left join fetch post.details")
    List<Post> findAllEagerly();

    @Query("select post from OneToOnePost post left join fetch post.details where post.id =:id")
    Optional<Post> findByIdEagerly(@Param("id") Long id);

}
