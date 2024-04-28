package com.devstack.pos.dao.custom;

import com.devstack.pos.dao.CrudDao;
import com.devstack.pos.entity.Customer;
import com.devstack.pos.entity.User;

public interface UserDao extends CrudDao<User, String> {
    public User loginUser(String email);
}
