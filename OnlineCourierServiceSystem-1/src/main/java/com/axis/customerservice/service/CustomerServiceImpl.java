package com.axis.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.customerservice.controller.CustomerRepository;
import com.axis.customerservice.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerRepository customerRepository;
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	
		
	}


