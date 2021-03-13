package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle;
import com.upgrad.hirewheels.entities.vehicle_sub_category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleSubCategoryDAO {

    public vehicle_sub_category findById(int id);

    public vehicle_sub_category save(vehicle_sub_category vehicle_sub_categoryList);

    public void delete(vehicle_sub_category vehicle_sub_categoryList);
}
