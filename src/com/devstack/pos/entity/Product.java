package com.devstack.pos.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {
    @Id
    private long id;
    private String name;
    private double price;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Batch> batches = new HashSet<>();

    @OneToOne(mappedBy = "product", fetch = FetchType.LAZY)
    private Inventory inventory;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<OrderDetails> orderDetails= new HashSet<>();

    public Product() {
    }

    public Product(long id, String name, double price, Set<Batch> batches, Inventory inventory, Set<OrderDetails> orderDetails) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.batches = batches;
        this.inventory = inventory;
        this.orderDetails = orderDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Batch> getBatches() {
        return batches;
    }

    public void setBatches(Set<Batch> batches) {
        this.batches = batches;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Set<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
