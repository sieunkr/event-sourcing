package com.example.demo.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

@Document(collection = "test_events")
@Data
public class EventInStore {

    @Id
    private String id;

    private Instant occurredOn;

    private String type;

    private String data;

    private UUID articleNo;

    public EventInStore(Instant occurredOn, String type, String data, UUID articleNo){
        this.occurredOn = occurredOn;
        this.type = type;
        this.data = data;
        this.articleNo = articleNo;
    }

}
