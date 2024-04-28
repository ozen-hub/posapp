package com.devstack.pos.bo;

import com.devstack.pos.bo.custom.impl.CustomerBoImpl;
import com.devstack.pos.bo.custom.impl.UserBoImpl;
import com.devstack.pos.dao.custom.impl.CustomerDaoImpl;
import com.devstack.pos.dao.custom.impl.UserDaoImpl;

public class BoFactory {
    private BoFactory() {
    }

    public enum BoType {
        USER, CUSTOMER
    }

    public static <T> T getBo(BoType type) {
        switch (type) {
            case USER:
                return (T) new UserBoImpl();
            case CUSTOMER:
                return (T) new CustomerBoImpl();
            default:
                return null;
        }
    }

}
