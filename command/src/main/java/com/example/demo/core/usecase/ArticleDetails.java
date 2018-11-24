package com.example.demo.core.usecase;

import com.example.demo.core.event.ArticleInitialized;
import com.example.demo.core.event.DomainEvent;

public interface ArticleDetails {

    void createArticle(ArticleInitialized event);
    void updateArticle(DomainEvent event);
    void activeArticle(DomainEvent event);
    void inActiveArticle(DomainEvent event);

}
