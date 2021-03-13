package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class vehicleDAOImpl implements vehicleDAO{
    private final SessionFactory sessionFactory;

    @Autowired
    public vehicleDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public vehicle findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle vehiclelist = session.get(vehicle.class, id);

        transaction.commit();
        session.close();

        return vehiclelist;
    }


    @Override
    public vehicle save(vehicle vehicle_List) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(vehicle_List);

        transaction.commit();
        session.close();

        return vehicle_List;
    }
    @Override
    public void delete(vehicle vehicle_List) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle mergedCustomer = (vehicle)session.merge(vehicle_List);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
