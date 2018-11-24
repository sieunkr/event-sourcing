package com.example.demo.provider;

import com.example.demo.core.event.ArticleInitialized;
import com.example.demo.core.event.DomainEvent;
import com.example.demo.core.model.EventInStore;
import com.example.demo.core.repository.DomainEventRepository;
import com.example.demo.core.usecase.ArticleDetails;
import org.springframework.stereotype.Component;

@Component
public class MongoArticleProvider implements ArticleDetails {

    private final DomainEventRepository domainEventRepository;

    public MongoArticleProvider(DomainEventRepository domainEventRepository) {
        this.domainEventRepository = domainEventRepository;
    }

    @Override
    public void createArticle(ArticleInitialized event) {

        EventInStore eventInStore = new EventInStore(event.getTimestamp(), event.getType(), event.getBody(), event.getArticleNo());

        domainEventRepository.save(eventInStore);
    }

    @Override
    public void updateArticle(DomainEvent event) {
        //domainEventRepository.save(event);
    }

    @Override
    public void activeArticle(DomainEvent event) {
        //domainEventRepository.save(event);
    }

    @Override
    public void inActiveArticle(DomainEvent event) {
        //domainEventRepository.save(event);
    }
}
