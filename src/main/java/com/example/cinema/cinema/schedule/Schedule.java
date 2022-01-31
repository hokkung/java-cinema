package com.example.cinema.cinema.schedule;

import java.util.Date;

import com.example.cinema.cinema.cinema.Theater;
import com.example.cinema.cinema.movie.Movie;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Schedule {

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private Date startTime;

    @Getter
    @Setter
    private Date endTime;

    @Getter
    @Setter
    private Movie movie;

    @Getter
    @Setter
    private Theater theater;

}
