package com.devstack.pos.entity;

import javax.persistence.*;

@Entity
public class Inventory {
    @Id
    private String id;
    private int qty;
    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    public Inventory() {
    }

    public Inventory(String id, int qty, Product product) {
        this.id = id;
        this.qty = qty;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
