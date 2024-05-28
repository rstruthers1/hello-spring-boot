package com.example.hello.controllers;

import com.example.hello.models.Greeting;
import com.example.hello.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;

public class GreetingControllerTest {

    @Mock
    private GreetingService greetingService;

    @InjectMocks
    private GreetingController greetingController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(greetingController).build();
    }

    @Test
    public void testGetAllGreetings() throws Exception {
        // Arrange
        Greeting greeting1 = new Greeting(1L, "Hello, World!");
        Greeting greeting2 = new Greeting(2L, "Hi there!");
        List<Greeting> greetings = Arrays.asList(greeting1, greeting2);

        when(greetingService.findAll()).thenReturn(greetings);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/api/greetings")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].message", is("Hello, World!")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].message", is("Hi there!")));
    }

    @Test
    public void testCreateGreeting() throws Exception {
        Greeting savedGreeting = new Greeting(1L, "Hello, Test!");

        when(greetingService.save(any(Greeting.class))).thenReturn(savedGreeting);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.post("/api/greetings")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"message\":\"Hello, Test!\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.message", is("Hello, Test!")));

    }
}

