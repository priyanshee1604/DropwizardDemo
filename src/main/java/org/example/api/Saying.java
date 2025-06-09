package org.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
    private long id;
    private String content;

    public Saying() {
        // Jackson needs this empty constructor to deserialize JSON to Java
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
