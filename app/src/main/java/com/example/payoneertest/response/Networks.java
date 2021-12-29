package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Networks {
    @JsonProperty("applicable")
    public List<Applicable> getApplicable() {
        return this.applicable;
    }

    public void setApplicable(List<Applicable> applicable) {
        this.applicable = applicable;
    }

    List<Applicable> applicable;
}
