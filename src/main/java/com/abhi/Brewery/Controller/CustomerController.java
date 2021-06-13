package com.abhi.Brewery.Controller;

import com.abhi.Brewery.Model.CustomerDTO;
import com.abhi.Brewery.Services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        System.out.println("Customer Controller Constructor..");
        this.customerService =customerService;
    }

    @RequestMapping("/test")
    public String test(){
        return "Test";
    }

    @RequestMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerByID(@PathVariable("customerId")UUID id){
        return new ResponseEntity<>(customerService.getCustomerByID(id), HttpStatus.OK);
    }
}
