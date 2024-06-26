package com.devstack.pos.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<Orders> orders = new HashSet<>();

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY)
    private LoyaltyCard loyaltyCard;

    public Customer() {
    }

    public Customer(String id, String name, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Customer(String id, String name, String address, Double salary, Set<Orders> orders, LoyaltyCard loyaltyCard) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.orders = orders;
        this.loyaltyCard = loyaltyCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
