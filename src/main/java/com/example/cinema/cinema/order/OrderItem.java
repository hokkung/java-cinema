package com.example.cinema.cinema.order;

import com.example.cinema.cinema.cinema.Seat;
import com.example.cinema.cinema.schedule.Schedule;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class OrderItem {

    @Getter
    @Setter
    private Schedule schedule;

    @Getter
    @Setter
    private Seat seat;
}
