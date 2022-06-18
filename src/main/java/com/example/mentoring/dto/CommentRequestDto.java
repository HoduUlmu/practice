package com.example.mentoring.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long articleId;
    private String content;
}
