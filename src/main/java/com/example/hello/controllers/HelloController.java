package com.example.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello AWS Secrets Manager!";
        }

}
