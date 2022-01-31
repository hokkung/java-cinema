package com.example.cinema.cinema;

import java.util.ArrayList;
import java.util.List;

import com.example.cinema.cinema.cinema.Cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeDataConfiguration {
    @Bean
    public List<Cinema> cinemas() {
        final List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(Cinema.create("A"));
        cinemas.add(Cinema.create("B"));
        cinemas.add(Cinema.create("C"));

        return cinemas;
    }
}
