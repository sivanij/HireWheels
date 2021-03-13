package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.location;
import com.upgrad.hirewheels.entities.users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class locationDAOImpl implements locationDAO{
    private final SessionFactory sessionFactory;

    @Autowired
    public locationDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public location findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        location locationlist = session.get(location.class, id);

        transaction.commit();
        session.close();

        return locationlist;
    }


    @Override
    public location save(location locationList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(locationList);

        transaction.commit();
        session.close();

        return locationList;
    }
    @Override
    public void delete(location locationList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        location mergedCustomer = (location)session.merge(locationList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
