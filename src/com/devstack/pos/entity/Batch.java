package com.devstack.pos.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
public class Batch {
    @Id
    private String id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date expirationDate;
    private Blob barcode;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;


    public Batch() {
    }

    public Batch(String id, Date expirationDate, Blob barcode, Product product) {
        this.id = id;
        this.expirationDate = expirationDate;
        this.barcode = barcode;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Blob getBarcode() {
        return barcode;
    }

    public void setBarcode(Blob barcode) {
        this.barcode = barcode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
