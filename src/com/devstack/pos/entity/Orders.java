package com.devstack.pos.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date date;
    private double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="orders")
    private Set<OrderDetails> orderDetails= new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    private Orders orders;

    public Orders() {
    }

    public Orders(long id, Date date, double amount, Customer customer, Set<OrderDetails> orderDetails, Orders orders) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.customer = customer;
        this.orderDetails = orderDetails;
        this.orders = orders;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
