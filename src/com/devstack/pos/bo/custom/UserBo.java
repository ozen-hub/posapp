package com.devstack.pos.bo.custom;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.UserDto;

public interface UserBo extends SuperBo {
    public void create(UserDto userDto);
}
