package com.devstack.pos.dto;

public class CustomerDto {
    private String id;
    private String name;
    private String address;
    private Double salary;
    private String privilegeType;

    public CustomerDto() {
    }

    public CustomerDto(String id, String name, String address, Double salary, String privilegeType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.privilegeType = privilegeType;
    }

    public CustomerDto(String id, String name, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
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
}
