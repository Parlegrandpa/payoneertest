package com.example.payoneertest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class FetchDataResponse{
    @JsonProperty("links")
    public Links getLinks() {
        return this.links; }
    public void setLinks(Links links) {
        this.links = links; }
    Links links;
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return this.timestamp; }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp; }
    Date timestamp;
    @JsonProperty("operation")
    public String getOperation() {
        return this.operation; }
    public void setOperation(String operation) {
        this.operation = operation; }
    String operation;
    @JsonProperty("resultCode")
    public String getResultCode() {
        return this.resultCode; }
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode; }
    String resultCode;
    @JsonProperty("resultInfo")
    public String getResultInfo() {
        return this.resultInfo; }
    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo; }
    String resultInfo;
    @JsonProperty("returnCode")
    public ReturnCode getReturnCode() {
        return this.returnCode; }
    public void setReturnCode(ReturnCode returnCode) {
        this.returnCode = returnCode; }
    ReturnCode returnCode;
    @JsonProperty("status")
    public Status getStatus() {
        return this.status; }
    public void setStatus(Status status) {
        this.status = status; }
    Status status;
    @JsonProperty("interaction")
    public Interaction getInteraction() {
        return this.interaction; }
    public void setInteraction(Interaction interaction) {
        this.interaction = interaction; }
    Interaction interaction;
    @JsonProperty("identification")
    public Identification getIdentification() {
        return this.identification; }
    public void setIdentification(Identification identification) {
        this.identification = identification; }
    Identification identification;
    @JsonProperty("networks")
    public Networks getNetworks() {
        return this.networks; }
    public void setNetworks(Networks networks) {
        this.networks = networks; }
    Networks networks;
}

