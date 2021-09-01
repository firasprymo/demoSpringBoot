package com.example.demo.customer;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RequestMapping(path = "/api/v2/customers")
@RestController
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

//    @GetMapping
//    List<Customer> getCustomers() {
//        return customerService.getCustomers();
//    }
//    @GetMapping(path="{customerId}")
//    Customer getCustomer(@PathVariable("customerId") Long id){
//        return customerService.getCustomers();
//    }
//    @GetMapping(path="{customerId}/exception")
//    Customer getCustomerException(@PathVariable("customerId") Long id){
//       throw new ApiRequestException("ApiRequestException for customer"+id);
//    }

}
