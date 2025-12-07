package com.sample.demo.service;


import com.sample.demo.model.Customer;
import com.sample.demo.model.DiscountCustomer;
import com.sample.demo.repositories.CustomerRepo;
import com.sample.demo.repositories.DiscountCustomerRepo;
import com.sample.demo.repositories.DiscountRepo;
import com.sample.demo.model.Discount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponUpdate {
    CustomerRepo customerRepo;
    DiscountRepo  discountRepo;
    DiscountCustomerRepo discountCustomerRepo;
    CouponDelete coupenDelete;
    public CouponUpdate(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public String updateDiscount(int id, Discount newData, List<Integer> c_ids) {

        Discount existing = discountRepo.findById(id);
        if (existing == null) {
            return "discount not found";
        }

        existing.setTitle(newData.getTitle());
        existing.setC_type(newData.getC_type());
        existing.setD_type(newData.getD_type());
        existing.setD_value(newData.getD_value());
        existing.setExpiry_date(newData.getExpiry_date());
        existing.setUsage_per_customer(newData.getUsage_per_customer());
        existing.setMin_discount(newData.getMin_discount());
        existing.setMax_discount(newData.getMax_discount());
        existing.setFrequency(newData.getFrequency());
        discountRepo.save(existing);
        if(!c_ids.isEmpty()){
            for (Integer c_id : c_ids) {
                Customer c = customerRepo.findById((int)c_id);
                if(c!=null){
                    DiscountCustomer dc = new DiscountCustomer();
                    dc.setDiscount(existing);
                    dc.setCustomer(c);
                    discountCustomerRepo.save(dc);
                }
            }
        }
        else{
            DiscountCustomer d = discountCustomerRepo.findByDiscount(existing);
            discountCustomerRepo.deleteById(d.getId());;
        
        }
        return "Success";
    }
}
