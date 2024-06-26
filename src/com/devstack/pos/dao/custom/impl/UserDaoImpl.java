package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.UserDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public void create(User user) {
        try (Session session = HibernateUtil.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }
    }

    @Override
    public User read(String string) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String string) {

    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public User loginUser(String email) {
        try (Session session = HibernateUtil.openSession()) {
            Query<User> query = session.createQuery("FROM User WHERE username= :username", User.class);
            query.setParameter("username",email);
            return query.uniqueResult();
        }
    }
}
