package com.goit.spring.off2.controller;

public class TestAnswer {
    private String message;

    public TestAnswer(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
