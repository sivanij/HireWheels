package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_id;
    @Column(nullable = false)
    private int vehicle_number;
    @Column(nullable = false)
    private String colour;
    @Column(nullable = false)
    private String vehicle_image ;
    @Column(nullable = false)
    private boolean availability_status ;

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(int vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getVehicle_image() {
        return vehicle_image;
    }

    public void setVehicle_image(String vehicle_image) {
        this.vehicle_image = vehicle_image;
    }

    public boolean isAvailability_status() {
        return availability_status;
    }

    public void setAvailability_status(boolean availability_status) {
        this.availability_status = availability_status;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_number=" + vehicle_number +
                ", colour='" + colour + '\'' +
                ", vehicle_image='" + vehicle_image + '\'' +
                ", availability_status=" + availability_status +
                '}';
    }
}
