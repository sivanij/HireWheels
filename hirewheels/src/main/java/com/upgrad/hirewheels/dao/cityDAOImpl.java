package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.city;
import com.upgrad.hirewheels.entities.location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class cityDAOImpl implements cityDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public cityDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public city findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        city citylist = session.get(city.class, id);

        transaction.commit();
        session.close();

        return citylist;
    }


    @Override
    public city save(city cityList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(cityList);

        transaction.commit();
        session.close();

        return cityList;
    }
    @Override
    public void delete(city cityList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        city mergedCustomer = (city)session.merge(cityList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
