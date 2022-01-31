package com.example.cinema.cinema.cinema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaRepository {

    @Autowired
    private List<Cinema> cinemas;

    public List<Cinema> findAll() {
        return cinemas;
    }
}
