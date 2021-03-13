package com.upgrad.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.upgrad.hirewheels.entities.users;

import java.util.List;

public interface usersDAO  {
    public List<users> findByFirstName(String firstName);
    public List<users> findByLastName(String lastName);
    public List<users> findByEmail(String email);
    public List<users> findByMobileNumber(String mobileNumber);
    public  users save(users usersList);
    public users findById(int id);

}
