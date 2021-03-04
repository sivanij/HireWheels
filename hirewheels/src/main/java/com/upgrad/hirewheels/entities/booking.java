package com.upgrad.hirewheels.entities;


import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;
    @Column(nullable = false)
    private LocalDateTime pickup_date;
    @Column(nullable = false)
    private LocalDateTime drop_off_date;
    @Column(nullable = false)
    private LocalDateTime booking_date;
    @Column(nullable = false)
    private int booking_amount;
    private String actual_drop_off_date;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(LocalDateTime pickup_date) {
        this.pickup_date = pickup_date;
    }

    public LocalDateTime getDrop_off_date() {
        return drop_off_date;
    }

    public void setDrop_off_date(LocalDateTime drop_off_date) {
        this.drop_off_date = drop_off_date;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    public int getBooking_amount() {
        return booking_amount;
    }

    public void setBooking_amount(int booking_amount) {
        this.booking_amount = booking_amount;
    }

    public String getActual_drop_off_date() {
        return actual_drop_off_date;
    }

    public void setActual_drop_off_date(String actual_drop_off_date) {
        this.actual_drop_off_date = actual_drop_off_date;
    }

    @Override
    public String toString() {
        return "booking{" +
                "booking_id=" + booking_id +
                ", pickup_date=" + pickup_date +
                ", drop_off_date=" + drop_off_date +
                ", booking_date=" + booking_date +
                ", booking_amount=" + booking_amount +
                ", actual_drop_off_date='" + actual_drop_off_date + '\'' +
                '}';
    }
}
