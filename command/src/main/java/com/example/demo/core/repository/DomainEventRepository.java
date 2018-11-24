package com.example.demo.core.repository;

import com.example.demo.core.model.EventInStore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DomainEventRepository extends MongoRepository<EventInStore, Integer> {
}
