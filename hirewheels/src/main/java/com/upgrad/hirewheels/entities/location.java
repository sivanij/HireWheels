package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int location_id;
    @Column(nullable = false)
    private String location_name;
    @Column(nullable = false)
    private String address;
     @Column(nullable = false)
    private int pincode;

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
