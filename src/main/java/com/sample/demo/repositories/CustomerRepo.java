package com.sample.demo.repositories;

import com.sample.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
public Customer findById(int id);
}
