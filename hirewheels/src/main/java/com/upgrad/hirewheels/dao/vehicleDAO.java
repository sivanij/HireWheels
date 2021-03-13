package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.booking;
import com.upgrad.hirewheels.entities.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleDAO  {

    public vehicle findById(int id);

    public vehicle save(vehicle vehicleList);

    public void delete(vehicle vehicleList);
}
