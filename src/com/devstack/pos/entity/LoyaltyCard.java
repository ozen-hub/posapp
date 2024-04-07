package com.devstack.pos.entity;

import javax.persistence.*;

@Entity
public class LoyaltyCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cardNumber;
    private String type;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public LoyaltyCard() {
    }

    public LoyaltyCard(long id, String cardNumber, String type, Customer customer) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.type = type;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
