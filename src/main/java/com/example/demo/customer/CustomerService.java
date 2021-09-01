package com.example.demo.customer;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {
//    private final CustomerRepository customerRepository;
//
//    List<Customer> getCustomers() {
//        log.info("getCustomers was called");
//        return customerRepository.findAll();
//    }
//
//    Customer getCostumer(Long id) {
//        return customerRepository
//                .findById(id)
//                .orElseThrow(
//                        () -> {
//                            NotFoundException notFoundException = new NotFoundException(
//                                    "customer with id " + id + "not ofund"
//                            );
//                            log.error("error in getting customer {}", id, notFoundException);
//                            return notFoundException;
//                        });
//    }
}
