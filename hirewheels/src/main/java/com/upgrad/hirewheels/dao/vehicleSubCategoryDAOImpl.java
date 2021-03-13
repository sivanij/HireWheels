package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle_category;
import com.upgrad.hirewheels.entities.vehicle_sub_category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class vehicleSubCategoryDAOImpl implements  vehicleSubCategoryDAO{
    private final SessionFactory sessionFactory;

    @Autowired
    public vehicleSubCategoryDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public vehicle_sub_category findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle_sub_category vehicle_sub_categorylist = session.get(vehicle_sub_category.class, id);

        transaction.commit();
        session.close();

        return vehicle_sub_categorylist;
    }


    @Override
    public vehicle_sub_category save(vehicle_sub_category vehicle_sub_categoryList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(vehicle_sub_categoryList);

        transaction.commit();
        session.close();

        return vehicle_sub_categoryList;
    }
    @Override
    public void delete(vehicle_sub_category vehicle_sub_categoryList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        vehicle_sub_category mergedCustomer = (vehicle_sub_category)session.merge(vehicle_sub_categoryList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
