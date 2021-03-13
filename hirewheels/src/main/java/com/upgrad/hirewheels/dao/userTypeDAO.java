package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.user_type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userTypeDAO  {
    public user_type save(user_type usersTypeList);
}
