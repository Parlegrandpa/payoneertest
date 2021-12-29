package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identification {
    @JsonProperty("longId")
    public String getLongId() {
        return this.longId;
    }

    public void setLongId(String longId) {
        this.longId = longId;
    }

    String longId;

    @JsonProperty("shortId")
    public String getShortId() {
        return this.shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    String shortId;

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    String transactionId;
}
