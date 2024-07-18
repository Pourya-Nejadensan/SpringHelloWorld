package org.example.springhelloworld;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    List<Message> messages = new ArrayList<>();

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/messages")
    public String addMessage(@RequestBody Message newMessage) {
        messages.add(newMessage);
        return "Message added!";
    }

    @GetMapping("messages")
    public List<Message> getMessages() {
        return messages;
    }
}
