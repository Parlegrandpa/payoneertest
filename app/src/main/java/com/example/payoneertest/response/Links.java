package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
    @JsonProperty("self")
    public String getSelf() {
        return this.self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    String self;

    @JsonProperty("lang")
    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    String lang;

    @JsonProperty("logo")
    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    String logo;

    @JsonProperty("operation")
    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    String operation;

    @JsonProperty("validation")
    public String getValidation() {
        return this.validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    String validation;
}
