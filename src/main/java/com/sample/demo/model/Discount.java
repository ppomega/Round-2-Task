package com.sample.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Discount {

    @Id
    private int id;
    private String title;
    private String c_type;
    private String d_type;
    private int d_value;
    private Date expiry_date;
    private String usage_per_customer;
    private int min_discount;
    private int max_discount;
    private int frequency;

    public int getId() {
        return id;
    }

    public void setId(int coupon_id) {
        this.id = coupon_id;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public int getD_value() {
        return d_value;
    }

    public void setD_value(int d_value) {
        this.d_value = d_value;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getUsage_per_customer() {
        return usage_per_customer;
    }

    public void setUsage_per_customer(String usage_per_customer) {
        this.usage_per_customer = usage_per_customer;
    }

    public int getMin_discount() {
        return min_discount;
    }

    public void setMin_discount(int min_discount) {
        this.min_discount = min_discount;
    }

    public int getMax_discount() {
        return max_discount;
    }

    public void setMax_discount(int max_discount) {
        this.max_discount = max_discount;
    }
}
