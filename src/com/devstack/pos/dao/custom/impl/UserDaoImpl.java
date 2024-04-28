package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.UserDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public void create(User user) {
            try (Session session = HibernateUtil.openSession()){
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
}
