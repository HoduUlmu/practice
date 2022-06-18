package com.example.mentoring.repository;

import com.example.mentoring.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Override
    @Query("select distinct a from Article a left join fetch a.comments")
    List<Article> findAll();
}
