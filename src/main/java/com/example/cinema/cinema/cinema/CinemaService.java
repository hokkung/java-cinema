package com.example.cinema.cinema.cinema;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getCinemas() {
        return cinemaRepository.findAll();
    }

    public Cinema getCinema(long id) {
        return cinemaRepository.findAll().stream().filter(c -> c.getId() == id).findFirst().get();
    }
}
