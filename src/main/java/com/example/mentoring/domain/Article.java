package com.example.mentoring.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id @GeneratedValue
    @Column(name = "article_id")
    private Long id;

    private String title;
    private String content;

    @OneToMany(mappedBy = "article")
    private List<Comment> comments;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
    }
}
