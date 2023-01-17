package com.axis.customerservice.controller;

import java.util.List;

import com.axis.customerservice.model.Customer;

public interface CustomerRepository {

	Customer save(Customer customer);

	List<Customer> findAll();

}
