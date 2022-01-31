package com.example.cinema.cinema.movie;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Movie {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private double price;
}
