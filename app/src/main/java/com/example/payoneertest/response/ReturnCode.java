package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnCode {
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    String source;
}
