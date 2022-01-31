package com.example.cinema.cinema.cinema;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Theater {
    @Getter
    @Setter
    private int no;

    @Getter
    @Setter
    private List<Seat> seats;
}
