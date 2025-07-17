package org.example.spring2springweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public String sayHello(@PathVariable String id) {
        return "Hallo, " + id + "!";
    }
}
