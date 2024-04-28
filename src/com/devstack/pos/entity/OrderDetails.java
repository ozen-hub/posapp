package com.devstack.pos.entity;

import javax.persistence.*;

@Entity(name="order_details")
public class OrderDetails {
    @Id
    private String id;

    private int qty;

    @ManyToOne(fetch = FetchType.LAZY)
    private Orders orders;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    public OrderDetails() {
    }

    public OrderDetails(String id, int qty, Orders orders, Product product) {
        this.id = id;
        this.qty = qty;
        this.orders = orders;
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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
