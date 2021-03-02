package com.hello.dansfinaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data
public class Job {

    private @Id String id;

    @JsonProperty("type")
    private String typee;

    private String url;
}
