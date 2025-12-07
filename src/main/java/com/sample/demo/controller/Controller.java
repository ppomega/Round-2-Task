package com.sample.demo.controller;


import com.sample.demo.model.Discount;
import com.sample.demo.service.CouponDelete;
import com.sample.demo.service.CouponFetch;
import com.sample.demo.service.CouponSave;
import com.sample.demo.service.CouponUpdate;
import com.sample.demo.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    CouponFetch couponFetch;
    @Autowired
    CouponSave couponSave;
    @Autowired
    CouponUpdate couponUpdate;
    @Autowired
    CouponDelete couponDelete;


   @GetMapping("/discounts")
    public List<Discount> get(){

    return couponFetch.getCoupons();
}
    @PostMapping("/save")
    public String save(@RequestBody Discount discount){

        return  couponSave.couponSave(discount);
    }

    @DeleteMapping("/discount/${title}")
    public String deleteDiscount(@RequestParam String title){
    return couponDelete.deleteByTitle(title);
    }

    @PutMapping("/discount")
    public String updateDiscount(@RequestBody Util util){
       Discount d = util.discount;
       List<Integer> customer_ids = util.customer_ids;
       return couponUpdate.updateDiscount(d.getId(),d,customer_ids);
    }



}
