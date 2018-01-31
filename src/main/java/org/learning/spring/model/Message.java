package org.learning.spring.model;


import org.springframework.stereotype.Component;

@Component
public class Message {
    private int id;
    private String message;

    public Message() {
    }
    public Message(int id, String message){
        this.id = id;
        this.message = message;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}