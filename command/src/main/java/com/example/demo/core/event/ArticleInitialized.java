package com.example.demo.core.event;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Data
public class ArticleInitialized implements DomainEvent {

    private final UUID articleNo;
    private final String title;
    //@Getter
    private final String body;
    private final Instant timestamp;

    public ArticleInitialized(UUID articleNo, String title, String body, Instant timestamp) {
        this.articleNo = articleNo;
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "article-initialized";
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public UUID getArticleNo() {
        return articleNo;
    }
}
