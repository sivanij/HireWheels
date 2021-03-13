package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.city;
import com.upgrad.hirewheels.entities.fuel_type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cityDAO  {

    public city findById(int id);

    public city save(city cityList);

    public void delete(city cityList);
}
