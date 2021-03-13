package com.upgrad.hirewheels.dto;

import com.upgrad.hirewheels.entities.fuel_type;
import com.upgrad.hirewheels.entities.location;
import com.upgrad.hirewheels.entities.vehicle_sub_category;

public class vehicleDTO {
    int vehicle_id;
    int vehicle_number;
    String colour;
    String vehicle_image ;
    boolean availability_status ;
    fuel_type fuel_type_id;
    location location_id;
    vehicle_sub_category vehicle_sub_category_id;



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
}
