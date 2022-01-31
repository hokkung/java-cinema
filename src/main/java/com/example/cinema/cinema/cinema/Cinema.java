package com.example.cinema.cinema.cinema;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Cinema {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Theater> theaters;

    public static Cinema create() {
        Cinema cinema = new Cinema();

        return cinema;
    }

    public static Cinema create(String name) {
        Cinema cinema = create();
        cinema.setName(name);

        return cinema;
    }

    public void addTheater(Theater theater) {
        this.theaters.add(theater);
    }

}
