package com.axis.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.customerservice.model.Customer;



@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

