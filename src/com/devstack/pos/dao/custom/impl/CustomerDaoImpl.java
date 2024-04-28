package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void create(Customer customer) {
        try (Session session = HibernateUtil.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        }
    }

    @Override
    public Customer read(String string) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(String string) {

    }

    @Override
    public List<Customer> readAll() {
        try (Session session = HibernateUtil.openSession()) {
            Query<Customer> fromCustomer = session.createQuery("FROM Customer", Customer.class);
            return fromCustomer.list();
        }
    }
}
