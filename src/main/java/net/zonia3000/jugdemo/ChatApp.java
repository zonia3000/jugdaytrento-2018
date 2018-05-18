package net.zonia3000.jugdemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ChatApp {

    private final Queue<ChatMessage> messages = new ConcurrentLinkedQueue<>();

    public Queue<ChatMessage> getMessages() {
        return messages;
    }
}
