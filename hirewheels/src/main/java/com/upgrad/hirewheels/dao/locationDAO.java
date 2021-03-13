package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.location;
import com.upgrad.hirewheels.entities.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface locationDAO {

    public location findById(int id);

    public  location save(location locationList);

    public void delete(location locationList);
}
