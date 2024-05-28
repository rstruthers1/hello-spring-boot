package com.example.hello.controllers;

import com.example.hello.models.Greeting;
import com.example.hello.services.GreetingService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
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

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Greeting> createGreeting(@RequestBody Greeting greeting) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<>(greetingService.save(greeting), headers, org.springframework.http.HttpStatus.CREATED);
    }
}

