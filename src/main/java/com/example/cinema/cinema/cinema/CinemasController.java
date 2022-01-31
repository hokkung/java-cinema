package com.example.cinema.cinema.cinema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinemas")
public class CinemasController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Cinema> list() {
        return cinemaService.getCinemas();
    }

    @GetMapping("/:id")
    private Cinema get(@PathVariable long id) {
        return cinemaService.getCinema(id);
    }
}
