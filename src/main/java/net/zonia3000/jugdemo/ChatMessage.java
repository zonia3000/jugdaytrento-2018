package net.zonia3000.jugdemo;

public class ChatMessage {

    private final String username;
    private final String text;

    public ChatMessage(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }
}
