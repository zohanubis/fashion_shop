package com.zohanubis.response;

public class AuthResponse {
    private String jwt;
    private String message;

    public AuthResponse() {
    	
    }
    public AuthResponse(String jwt, String message) {
        super();
        this.jwt = jwt;
        this.message = message;
    }
}
