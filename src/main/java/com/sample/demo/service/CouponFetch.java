package com.sample.demo.service;


import com.sample.demo.repositories.DiscountRepo;
import com.sample.demo.model.Discount;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CouponFetch {
    DiscountRepo discountRepo;

    public List<Discount> getCoupons(){
        return discountRepo.findAll();
    }
}
