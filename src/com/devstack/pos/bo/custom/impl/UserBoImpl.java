package com.devstack.pos.bo.custom.impl;

import com.devstack.pos.bo.custom.UserBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.UserDao;
import com.devstack.pos.dto.UserDto;
import com.devstack.pos.entity.User;

public class UserBoImpl implements UserBo {

    UserDao userDao = DaoFactory.getDao(DaoFactory.DaoType.USER);

    @Override
    public void create(UserDto userDto) {
        userDao.create(
                new User(userDto.getId(), userDto.getUsername(), userDto.getPassword(), userDto.getFullName())
        );
    }
}
