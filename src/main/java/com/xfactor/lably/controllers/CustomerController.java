package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import com.xfactor.lably.entity.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    ArrayList<Customer> customers = new ArrayList<>();

    
    @GetMapping()
    public String customer() {
        return "customer!!!";
    }


    @PostMapping("/addCustomer")
    public Customer registerPost(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }

    @GetMapping("/getAllCustomers")
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("/getCustomerByUserName")
    public Customer getAdminByUserName(@RequestParam String username) {
        Customer resCustomer = null;
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(username)) {
                resCustomer = customer;
            }
        }
        return resCustomer;
    }

}