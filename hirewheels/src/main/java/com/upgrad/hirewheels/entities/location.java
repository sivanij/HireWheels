package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

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

     @ManyToOne
     @JoinColumn(name ="city_id ",nullable = false)
     private city city_id;
//     @OneToMany(mappedBy = "location_id")
//     private Set<vehicle> vehicles;
//     @OneToMany(mappedBy = "location_id")
//     private Set<booking>bookings;

    public city getCity_id() {
        return city_id;
    }

    public void setCity_id(city city_id) {
        this.city_id = city_id;
    }

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
                ", city_id= " + city_id+
                '}';
    }
}
