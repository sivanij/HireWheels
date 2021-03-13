package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class vehicle_sub_category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int vehicle_sub_category_id;
    @Column(nullable = false)
    private String model_name;
    @Column(nullable = false)
    private double price;
    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", nullable = false)
    private vehicle_category vehicle_category_id;
    @OneToMany(mappedBy = "vehicle_sub_category_id")
    private Set<vehicle> vehicles;

    public int getVehicle_sub_category_id() {
        return vehicle_sub_category_id;
    }

    public void setVehicle_sub_category_id(int vehicle_sub_category_id) {
        this.vehicle_sub_category_id = vehicle_sub_category_id;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public vehicle_category getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_category_id(vehicle_category vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    @Override
    public String toString() {
        return "vehicle_sub_category{" +
                "vehicle_sub_category_id=" + vehicle_sub_category_id +
                ", model_name='" + model_name + '\'' +
                ", price=" + price +
                ", vehicle_category_id= " + vehicle_category_id +
                '}';
    }
}
