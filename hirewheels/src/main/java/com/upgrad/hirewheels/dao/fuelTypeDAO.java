package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.fuel_type;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fuelTypeDAO  {

    public fuel_type findById(int id);

    public fuel_type save(fuel_type fuel_typeList);

    public void delete(fuel_type fuel_typeList);
}
