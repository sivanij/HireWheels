package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "fuel_type_id" , nullable = false)
    private fuel_type fuel_type_id;


    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private location location_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_sub_category_id", nullable = false)
    private vehicle_sub_category vehicle_sub_category_id;
    @OneToMany(mappedBy = "vehicle_id")
    private Set<booking> bookings;

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

    public fuel_type getFuel_type_id() {
        return fuel_type_id;
    }

    public void setFuel_type_id(fuel_type fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public location getLocation_id() {
        return location_id;
    }

    public void setLocation_id(location location_id) {
        this.location_id = location_id;
    }

    public vehicle_sub_category getVehicle_sub_category_id() {
        return vehicle_sub_category_id;
    }

    public void setVehicle_sub_category_id(vehicle_sub_category vehicle_sub_category_id) {
        this.vehicle_sub_category_id = vehicle_sub_category_id;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_number=" + vehicle_number +
                ", colour='" + colour + '\'' +
                ", vehicle_image='" + vehicle_image + '\'' +
                ", availability_status=" + availability_status +
                ", " +

                ", Location= " + location_id+
                ", Fuel_type= " + fuel_type_id+
                ", vehicle_sub_category= " + vehicle_sub_category_id +
                '}';
    }
}
