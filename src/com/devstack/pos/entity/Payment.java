package com.devstack.pos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payment {
    @Id
    private String id;
    private double amount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date payDate;

    @OneToOne(fetch = FetchType.LAZY)
    private Orders orders;

    public Payment() {
    }

    public Payment(String id, double amount, Date payDate, Orders orders) {
        this.id = id;
        this.amount = amount;
        this.payDate = payDate;
        this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
