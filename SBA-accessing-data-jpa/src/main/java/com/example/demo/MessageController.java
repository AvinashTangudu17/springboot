package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
public class MessageController {

    private final MessagePublisher publisher;

    public MessageController(MessagePublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/{message}")
    public String publishMessage(@PathVariable String message) {
        publisher.publish(message);
        return "Message published: " + message;
    }
}
