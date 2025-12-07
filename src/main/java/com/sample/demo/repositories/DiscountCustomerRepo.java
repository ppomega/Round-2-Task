package com.sample.demo.repositories;

import com.sample.demo.model.Discount;
import com.sample.demo.model.DiscountCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountCustomerRepo extends JpaRepository<DiscountCustomer,String> {

    public DiscountCustomer findByDiscount(Discount discount);
    public void deleteById(Long id);
    public void deleteByDiscount(Discount discount);
}
