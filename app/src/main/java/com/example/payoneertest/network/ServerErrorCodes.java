package com.example.payoneertest.network;

import java.util.HashMap;

public class ServerErrorCodes {
    public HashMap Errors = new HashMap() {
    };

    public HashMap Info = new HashMap() {
    };

    private ServerErrorCodes() {

        Info.put("MwI01", "Successful");
        Info.put("MwI02", "Login successful");

        Errors.put("MwE01", "Invalid source app id");
        Errors.put("MwE02", "User is blocked");
    }

    public static ServerErrorCodes instance() {
        return new ServerErrorCodes();
    }
}
