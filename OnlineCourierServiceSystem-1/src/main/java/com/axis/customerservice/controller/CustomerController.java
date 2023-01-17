package com.axis.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.customerservice.model.Customer;
import com.axis.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@Autowired
private CustomerService customerService;
@PostMapping("/add")
public String add(@RequestBody Customer customer) {
	customerService.saveCustomer(customer);
	return "New customer is added";
}
@GetMapping("/getAll")
public List<Customer> getAllcustomer(){
	return customerService.getAllCustomers();
}
}
