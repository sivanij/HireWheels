package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.booking;
import com.upgrad.hirewheels.entities.fuel_type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingDAO{

    public booking findById(int id);

    public booking save(booking bookingList);

    public void delete(booking bookingList);
}
