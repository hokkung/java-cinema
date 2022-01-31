package com.example.cinema.cinema.order;

import java.util.Date;
import java.util.List;

import com.example.cinema.cinema.cinema.Seat;
import com.example.cinema.cinema.schedule.Schedule;
import com.example.cinema.cinema.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Order {

    @Getter
    @Setter
    private Schedule schedule;

    @Getter
    @Setter
    private List<Seat> seats;

    @Getter
    @Setter
    private OrderStatus status;

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private Date createdTime;

    @Getter
    @Setter
    private Date updatedTime;

    @Getter
    @Setter
    private int totalPrice;

}
