package com.example.mentoring.dto;

import com.example.mentoring.domain.Article;
import com.example.mentoring.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ArticleResponseDto {
    private final String title;
    private final Long commentsNum;

    public ArticleResponseDto(String title, Long commentsNum) {
        this.title = title;
        this.commentsNum = commentsNum;
    }
}
