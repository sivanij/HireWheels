package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.fuel_type;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class fuelTypeDAOImpl implements fuelTypeDAO{
    private final SessionFactory sessionFactory;

    @Autowired
    public fuelTypeDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public fuel_type findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        fuel_type fuel_typelist = session.get(fuel_type.class, id);

        transaction.commit();
        session.close();

        return fuel_typelist;
    }


    @Override
    public fuel_type save(fuel_type fuel_typeList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(fuel_typeList);

        transaction.commit();
        session.close();

        return fuel_typeList;
    }
    @Override
    public void delete(fuel_type fuel_typeList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        fuel_type mergedCustomer = (fuel_type)session.merge(fuel_typeList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
