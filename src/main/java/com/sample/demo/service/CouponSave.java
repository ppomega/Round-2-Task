package com.sample.demo.service;


import com.sample.demo.repositories.DiscountRepo;
import com.sample.demo.model.Discount;
import org.springframework.stereotype.Service;

@Service
public class CouponSave {
    DiscountRepo discountRepo;

    public String couponSave(Discount discount){
        try{
            if(discountRepo.findByTitle(discount.getTitle())==null){
                discountRepo.save(discount);
            }
            else{
                return "coupon already exists";
            }
        } catch (Exception e) {
            return "error in saving coupon";
        }
        return "success";
    }
}
