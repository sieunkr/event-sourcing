package com.example.demo.core.event;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;
import java.util.UUID;

public class ArticleUpdated implements DomainEvent {

    private final UUID articleNo;
    private final String title;
    private final String body;
    private final Instant timestamp;

    public ArticleUpdated(UUID articleNo, String title, String body, Instant timestamp) {
        this.articleNo = articleNo;
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "article-updated";
    }
}
