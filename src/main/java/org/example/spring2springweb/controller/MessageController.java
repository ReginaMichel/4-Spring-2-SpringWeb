package org.example.spring2springweb.controller;

import org.example.spring2springweb.model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final List<Message> messages = new ArrayList<>();

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }

    @PostMapping
    public void postMessage(@RequestBody Message message) {
        messages.add(message);
    }
}
