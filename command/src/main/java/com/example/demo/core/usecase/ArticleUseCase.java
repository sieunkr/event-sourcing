package com.example.demo.core.usecase;

import com.example.demo.core.event.ArticleInitialized;
import com.example.demo.core.event.DomainEvent;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class ArticleUseCase {

    private final ArticleDetails articleDetails;

    public ArticleUseCase(ArticleDetails articleDetails) {
        this.articleDetails = articleDetails;
    }

    public void createArticle(){

        /*
        //ArticleInitialized domainEvent = new ArticleInitialized(UUID.randomUUID(), "테스트1", "본문", Instant.now());

        articleDetails.createArticle(domainEvent);
        */

    }
}
