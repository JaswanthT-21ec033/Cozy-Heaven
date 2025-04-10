package com.hotelbooking.cozyheaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.cozyheaven.exception.InvalidIDException;
import com.hotelbooking.cozyheaven.model.Customer;
import com.hotelbooking.cozyheaven.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllEmployees()
	{
		return customerService.getAllEmployees();
	}
	
	// Get customer by contact
	@GetMapping("/get/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) throws InvalidIDException 
	{
	     return customerService.getCustomerById(customerId);
	  
	}

   // Get customer by email
    @GetMapping("/get/email")
	public Customer getCustomerByContact(@RequestParam String contact) throws InvalidIDException 
	{
	     return customerService.getCustomerByContact(contact);
	}
    
// // Get customer by contact
//    @GetMapping("/get/email")
//	public Customer getCustomerByEmail(@RequestParam String email) throws InvalidIDException 
//	{
//	     return customerService.getCustomerByEmail(email);
//	}

	// Update customer
    @PutMapping("/update/{id}")
	public Customer updateCustomer(@PathVariable int id, @RequestBody Customer newValue) throws InvalidIDException
	{
			Customer customer = customerService.getCustomerById(id);
			if(newValue.getName() != null)
				customer.setName(newValue.getName());
			if(newValue.getEmail() != null)
				customer.setEmail(newValue.getEmail());
			if(newValue.getAddress() != null)
				customer.setAddress(newValue.getAddress());
			if(newValue.getContact() != null)
				customer.setContact(newValue.getContact());
			return customerService.addCustomer(customer);
	}

	// Delete customer
	@DeleteMapping("/delete/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) 
	{
	       customerService.deleteCustomer(customerId);
    }


}
