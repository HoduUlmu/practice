package com.example.mentoring.repository;

import com.example.mentoring.domain.Article;
import com.example.mentoring.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
