package com.devstack.pos.views.tm;

import javafx.scene.control.ButtonBar;

public class CustomerTm {
    private String id;
    private String name;
    private String address;
    private Double salary;
    private String privilegeType;
    private ButtonBar bar;

    public CustomerTm() {
    }

    public CustomerTm(String id, String name, String address, Double salary, String privilegeType, ButtonBar bar) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.privilegeType = privilegeType;
        this.bar = bar;
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

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public ButtonBar getBar() {
        return bar;
    }

    public void setBar(ButtonBar bar) {
        this.bar = bar;
    }
}
