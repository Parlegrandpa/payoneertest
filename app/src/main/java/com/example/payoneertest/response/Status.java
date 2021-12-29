package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    @JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    String code;

    @JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    String reason;
}
