package com.alonespring.aloneproject;

import com.alonespring.aloneproject.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
