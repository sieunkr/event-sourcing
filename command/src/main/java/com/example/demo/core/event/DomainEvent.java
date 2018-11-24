package com.example.demo.core.event;

import lombok.Data;

public interface DomainEvent {
    String getType();
}
