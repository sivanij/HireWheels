package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.booking;
import com.upgrad.hirewheels.entities.vehicle_category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class bookingDAOImpl implements bookingDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public bookingDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public booking findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        booking bookinglist = session.get(booking.class, id);

        transaction.commit();
        session.close();

        return bookinglist;
    }


    @Override
    public booking save(booking bookingList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(bookingList);

        transaction.commit();
        session.close();

        return bookingList;
    }
    @Override
    public void delete(booking bookingList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        booking mergedCustomer = (booking)session.merge(bookingList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }
}
