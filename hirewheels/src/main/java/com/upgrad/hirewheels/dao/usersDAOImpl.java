package com.upgrad.hirewheels.dao;
import com.upgrad.hirewheels.dao.usersDAO;
import com.upgrad.hirewheels.entities.users;
import org.hibernate.Transaction;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import java.util.Optional;

@Repository
public class usersDAOImpl implements usersDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public usersDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public users findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users customer = session.get(users.class, id);

        transaction.commit();
        session.close();

        return customer;
    }
    @Override
    public List<users> findByEmail(String email) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users users_list = session.get(users.class, email);

        transaction.commit();
        session.close();

        return (List<users>) users_list;
    }

    @Override
    public List<users> findByFirstName(String firstName) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users users_list = session.get(users.class, firstName);

        transaction.commit();
        session.close();

        return (List<users>) users_list;
    }

    @Override
    public List<users> findByLastName(String lastName) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users users_list = session.get(users.class, lastName);

        transaction.commit();
        session.close();

        return (List<users>) users_list;
    }

    @Override
    public List<users> findByMobileNumber(String mobileNumber) {


        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users users_list = session.get(users.class, mobileNumber);

        transaction.commit();
        session.close();

        return (List<users>) users_list;
    }


    @Override
    public users save(users usersList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(usersList);

        transaction.commit();
        session.close();

        return usersList;
    }
    @Override
    public void delete(users usersList) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        users mergedCustomer = (users)session.merge(usersList);
        session.delete(mergedCustomer);

        transaction.commit();
        session.close();
    }

}
