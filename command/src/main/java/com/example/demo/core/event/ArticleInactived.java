package com.example.demo.core.event;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArticleInactived implements DomainEvent {

    @Override
    @JsonIgnore
    public String getType() {
        return "article-inactived";
    }
}
