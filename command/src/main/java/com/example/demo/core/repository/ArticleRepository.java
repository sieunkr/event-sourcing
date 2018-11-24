package com.example.demo.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<ArticleRepository, Integer> {
}
