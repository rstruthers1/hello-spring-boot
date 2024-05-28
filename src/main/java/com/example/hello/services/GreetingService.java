package com.example.hello.services;

import com.example.hello.models.Greeting;
import com.example.hello.repositories.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public List<Greeting> findAll() {
        return greetingRepository.findAll();
    }

    public Greeting save(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
}

