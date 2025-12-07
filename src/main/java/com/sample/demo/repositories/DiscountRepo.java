package com.sample.demo.repositories;

import com.sample.demo.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface DiscountRepo extends JpaRepository<Discount,String> {

    public List<Discount> findAll();

    public Discount findByTitle(String title);

    public Discount findById(int id);

    public void deleteById(int id);
    public void deleteByTitle(String title);
}
