package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
        private String userName;
        private String message;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String username) {
            this.userName = username;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
}
