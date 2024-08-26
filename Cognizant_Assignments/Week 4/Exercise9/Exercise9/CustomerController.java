package com.bookstore.controller;

import com.bookstore.entity.Customer;
import com.bookstore.model.CustomerModel;
import com.bookstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerModel> createCustomer(@Valid @RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        CustomerModel customerModel = convertToModel(savedCustomer);
        return ResponseEntity.ok(customerModel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerModel> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id)
                .map(customer -> ResponseEntity.ok(convertToModel(customer)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<CustomerModel>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        List<CustomerModel> customerModels = customers.stream()
                .map(this::convertToModel)
                .toList();
        return ResponseEntity.ok(customerModels);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerModel> updateCustomer(@PathVariable Long id, @Valid @RequestBody Customer customerDetails) {
        return customerService.getCustomerById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            Customer updatedCustomer = customerService.saveCustomer(customer);
            CustomerModel customerModel = convertToModel(updatedCustomer);
            return ResponseEntity.ok(customerModel);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id).map(customer -> {
            customerService.deleteCustomer(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

    private CustomerModel convertToModel(Customer customer) {
        CustomerModel customerModel = new CustomerModel();
        customerModel.setId(customer.getId());
        customerModel.setName(customer.getName());
        customerModel.setEmail(customer.getEmail());

        Link selfLink = WebMvcLinkBuilder.linkTo(CustomerController.class).slash(customer.getId()).withSelfRel();
        customerModel.add(selfLink);

        return customerModel;
    }
}
