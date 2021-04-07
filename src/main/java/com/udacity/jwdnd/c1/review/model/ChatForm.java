package com.udacity.jwdnd.c1.review.model;

public class ChatForm {
    private String userName1;
    private String messageText;
    private String messageType;

    public String getUserName() {
        return userName1;
    }

    public void setUserName(String username) {
        this.userName1 = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
