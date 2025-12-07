package com.sample.demo.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    private int id;
    private String name;
    private String email;
    private String mobile;

    public int getC_id() {
        return id;
    }

    public void setC_id(int customer_id) {
        this.id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
