package com.axis.customerservice.service;

import java.util.List;

import com.axis.customerservice.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public List<Customer>getAllCustomers();
	
}
