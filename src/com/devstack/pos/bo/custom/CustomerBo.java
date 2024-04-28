package com.devstack.pos.bo.custom;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.CustomerDto;

import java.util.*;

public interface CustomerBo extends SuperBo {
    public void create(CustomerDto dto);
    public List<CustomerDto> findAll();
}
