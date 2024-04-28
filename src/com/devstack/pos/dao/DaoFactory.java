package com.devstack.pos.dao;

import com.devstack.pos.dao.custom.impl.CustomerDaoImpl;
import com.devstack.pos.dao.custom.impl.UserDaoImpl;

public class DaoFactory {
    private DaoFactory() {
    }

    public enum DaoType {
        USER,CUSTOMER
    }

    public static <T> T getDao(DaoType type) {
        switch (type) {
            case USER:
                return (T) new UserDaoImpl();
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
            default:
                return null;
        }
    }

}
