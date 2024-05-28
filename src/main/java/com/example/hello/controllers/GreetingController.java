package com.example.hello.controllers;

import com.example.hello.models.Greeting;
import com.example.hello.services.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public List<Greeting> getAllGreetings() {
        return greetingService.findAll();
    }

    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingService.save(greeting);
    }
}

