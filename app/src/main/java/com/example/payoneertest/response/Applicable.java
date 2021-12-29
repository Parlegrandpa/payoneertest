package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Applicable {
    @JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    String code;

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String label;

    @JsonProperty("method")
    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    String method;

    @JsonProperty("grouping")
    public String getGrouping() {
        return this.grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    String grouping;

    @JsonProperty("registration")
    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    String registration;

    @JsonProperty("recurrence")
    public String getRecurrence() {
        return this.recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    String recurrence;

    @JsonProperty("redirect")
    public boolean getRedirect() {
        return this.redirect;
    }

    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }

    boolean redirect;

    @JsonProperty("links")
    public Links getLinks() {
        return this.links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    Links links;

    @JsonProperty("selected")
    public boolean getSelected() {
        return this.selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    boolean selected;

    @JsonProperty("inputElements")
    public List<InputElement> getInputElements() {
        return this.inputElements;
    }

    public void setInputElements(List<InputElement> inputElements) {
        this.inputElements = inputElements;
    }

    List<InputElement> inputElements;

    @JsonProperty("operationType")
    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    String operationType;
}
