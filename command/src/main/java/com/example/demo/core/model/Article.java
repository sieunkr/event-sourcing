package com.example.demo.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "test_articles")
@Data
public class Article {

    @Id
    private String id;

    private long seq;

    private String title;

    private UUID articleNo;

    private String description;

    private String body;

    private String thumbnail;
}
