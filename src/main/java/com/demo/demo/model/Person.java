package com.demo.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.util.UUID;

@Data
public class Person {
    private final UUID id;
    @NonNull
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name)
    {
        this.id = id;
        this.name = name;
    }
}
