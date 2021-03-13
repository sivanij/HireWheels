package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;
import com.upgrad.hirewheels.entities.user_type;
public class userTypeDAOImpl implements userTypeDAO {
    private SessionFactory sessionFactory;
    @Autowired
    public userTypeDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public user_type save(user_type usersTypeList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(usersTypeList);

        transaction.commit();
        session.close();

        return usersTypeList;
    }
}
