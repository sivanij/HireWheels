package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.location;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  vehicleCategoryDAO  {

    public vehicle_category findById(int id);

    public vehicle_category save(vehicle_category vehicle_categoryList);

    public void delete(vehicle_category vehicle_categoryList);
}
