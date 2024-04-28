package com.devstack.pos.bo.custom.impl;

import com.devstack.pos.bo.custom.CustomerBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;
import com.devstack.pos.entity.LoyaltyCard;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CustomerBoImpl implements CustomerBo {

    private CustomerDao customerDao = DaoFactory.getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public void create(CustomerDto dto) {
        customerDao.create(
                new Customer(dto.getId(),
                        dto.getName(), dto.getAddress(), dto.getSalary())
        );
    }

    @Override
    public List<CustomerDto> findAll() {
        return customerDao.readAll().stream().map(this::toCustomerDto).collect(Collectors.toList());
    }

    private CustomerDto toCustomerDto(Customer customer){
        LoyaltyCard loyaltyCard = customer.getLoyaltyCard();
        String type="configure now";
        if (loyaltyCard!=null){
            type= loyaltyCard.getType();
        }
        return new CustomerDto(
                customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary(),type
        );
    }

}
