package org.example;

public class ReplyService {

    public String reply(String message, ReplyType type) {
        // 1) null / empty / spaces
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String theword = message.trim().toLowerCase();

        // hi
        if (theword.equals("hi")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Hey there! 😊 How can I help?";
            } else {
                return "Hello. How can I help?";
            }
        }
        // hello
        else if (theword.equals("hello")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Hi! 👋 What’s up?";
            } else {
                return "Hello. How can I help?";
            }
        }
        // how are you
        else if (theword.equals("how are you")) {
            if (type == ReplyType.FORMAL) {
                return "I am functioning properly. How may I assist you?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Doing great! 😄 How can I help?";
            } else {
                return "I’m good. How can I help?";
            }
        }
        // i need help
        else if (theword.equals("i need help")) {
            if (type == ReplyType.FORMAL) {
                return "I can assist with that. Please provide more details.";
            } else if (type == ReplyType.FRIENDLY) {
                return "I’ve got you! 🙂 Tell me a bit more.";
            } else {
                return "Share details; I’ll help.";
            }
        }
        // can you help me with my account
        else if (theword.equals("can you help me with my account")) {
            if (type == ReplyType.FORMAL) {
                return "Certainly. Please describe the account issue.";
            } else if (type == ReplyType.FRIENDLY) {
                return "Sure thing! 😊 What’s wrong with the account?";
            } else {
                return "Describe the account issue…";
            }
        }
        // thanks
        else if (theword.equals("thanks")) {
            if (type == ReplyType.FORMAL) {
                return "You are welcome.";

            } else if (type == ReplyType.FRIENDLY) {
                return "Anytime! 🙌";
            } else {
                return "You’re welcome.";

            }
        }
        // bye
        else if (theword.equals("bye")) {
            if (type == ReplyType.FORMAL) {
                return "Goodbye.";
            } else if (type == ReplyType.FRIENDLY) {
                return "See you later! 👋";
            } else {
                return "Goodbye.";
            }
        }
        // what is your name
        else if (theword.equals("what is your name")) {
            if (type == ReplyType.FORMAL) {
                return "I am your virtual assistant.";
            } else if (type == ReplyType.FRIENDLY) {
                return "I’m your helper bot 🤖";
            } else {
                return "I’m your assistant.";
            }
        }
        // any other text
        else {
            if (type == ReplyType.FORMAL) {
                return "Could you clarify your request?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Could you tell me more?";
            } else {
                return "Please clarify.";
            }
        }
    }
}
