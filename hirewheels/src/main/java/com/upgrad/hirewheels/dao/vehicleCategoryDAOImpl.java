package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.location;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class vehicleCategoryDAOImpl implements vehicleCategoryDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public vehicleCategoryDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public vehicle_category findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle_category vehicle_categorylist = session.get(vehicle_category.class, id);

        transaction.commit();
        session.close();

        return vehicle_categorylist;
    }


    @Override
    public vehicle_category save(vehicle_category vehicle_categoryList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(vehicle_categoryList);

        transaction.commit();
        session.close();

        return vehicle_categoryList;
    }
    @Override
    public void delete(vehicle_category vehicle_categoryList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle_category mergedCustomer = (vehicle_category)session.merge(vehicle_categoryList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
