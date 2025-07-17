package org.example.spring2springweb.controller;

import org.example.spring2springweb.model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final Map<String, Message> messages = new HashMap<>();

    @GetMapping
    public Map<String, Message> getMessages() {
        return messages;
    }

    @PostMapping
    public void postMessage(@RequestBody Message message) {
        messages.put(message.id(), message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable String id) {
        messages.remove(id);
    }
}
