package net.zonia3000.jugdemo;

import javax.enterprise.context.RequestScoped;
import javax.faces.push.Push;
import javax.faces.push.PushContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ChatPage {

    @Inject
    private User user;

    @Inject
    private ChatApp app;

    @Inject
    @Push
    private PushContext chatChannel;

    private String messageText;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void sendMessage() {
        ChatMessage msg = new ChatMessage(user.getUsername(), messageText);
        app.getMessages().add(msg);
        messageText = null;
        chatChannel.send("newMessage");
    }
}
