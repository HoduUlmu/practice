package com.example.mentoring.service;

import com.example.mentoring.domain.Article;
import com.example.mentoring.domain.Comment;
import com.example.mentoring.dto.ArticleResponseDto;
import com.example.mentoring.repository.ArticleRepository;
import com.example.mentoring.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;

    public void postArticle(String title, String content) {
        Article article = new Article(title, content);
        articleRepository.save(article);
    }


    public void postComment(Long articleId, String content) {
        Article article = articleRepository.findById(articleId).orElseThrow();
        Comment comment = new Comment(content, article);
        commentRepository.save(comment);
    }

    public List<ArticleResponseDto> getList() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleResponseDto> responseDtoList = new ArrayList<>();
        articles.forEach((article ->
                responseDtoList.add(
                        new ArticleResponseDto(article.getTitle(), (long) article.getComments().size()))));
        return responseDtoList;
    }
}
