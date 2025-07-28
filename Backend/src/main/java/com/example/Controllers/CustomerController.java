package com.example.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.CustomerMaster;
import com.example.Services.CustomerServiceImpl;

@RestController
@RequestMapping("api/customers")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl c_service;

    @GetMapping
    public List<CustomerMaster> getAllCustomers() {
        return c_service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<CustomerMaster> getCustomerById(@PathVariable Long id) {
        return c_service.getCustomerByid(id);
    }

    @GetMapping("/email/{email}")
    public Optional<CustomerMaster> getCustomerByEmailId(@PathVariable("email") String email) {
        return c_service.getCustomerByEmailId(email);
    }






    @PostMapping
    public void addCustomer(@RequestBody CustomerMaster customer) {
        c_service.addCustomer(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerMaster updatedCustomer) {
        c_service.updateCustomer(id, updatedCustomer);
        return ResponseEntity.ok("Customer updated successfully");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long id) {
        c_service.deleteCustomer(id);
        return ResponseEntity.ok("Customer deleted successfully");
    }

    
//    @GetMapping("/login/{email}/{password}")
//    public boolean login(@PathVariable String email, @PathVariable String password) {
//        return c_service.login(email, password);
//    }
}