package com.sample.demo.service;


import com.sample.demo.model.Discount;
import com.sample.demo.model.DiscountCustomer;
import com.sample.demo.repositories.DiscountCustomerRepo;
import com.sample.demo.repositories.DiscountRepo;
import org.springframework.stereotype.Service;

@Service
public class CouponDelete {
    DiscountRepo discountRepo;
    DiscountCustomerRepo discountCustomerRepo;
    public String deleteByTitle(String title){
        try {
            Discount discount = discountRepo.findByTitle(title);
            if(discount.getD_type().equals("SELECTED")){
                DiscountCustomer discountCustomer = discountCustomerRepo.findByDiscount(discount);
                discountCustomerRepo.deleteById(discountCustomer.getId());}
            discountRepo.deleteByTitle(title);    }
        catch (Exception e) {
            return "error in deleting coupon";
        }
        return "success";
    }
}
