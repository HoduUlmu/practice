package com.example.mentoring.controller;

import com.example.mentoring.dto.ArticleRequestDto;
import com.example.mentoring.dto.ArticleResponseDto;
import com.example.mentoring.dto.CommentRequestDto;
import com.example.mentoring.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/articles")
    public void postArticle(@RequestBody ArticleRequestDto requestDto) {
        articleService.postArticle(
                requestDto.getTitle(),
                requestDto.getContent());
    }

    @PostMapping("/comments")
    public void postComment(@RequestBody CommentRequestDto requestDto) {
        articleService.postComment(
                requestDto.getArticleId(),
                requestDto.getContent());
    }

    @GetMapping("/articles")
    public ResponseEntity<List<ArticleResponseDto>> getList() {
        return ResponseEntity.ok(articleService.getList());
    }
}
