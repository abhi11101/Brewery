package com.abhi.Brewery.Controller;

import com.abhi.Brewery.Model.CustomerDTO;
import com.abhi.Brewery.Services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        System.out.println("Customer Controller Constructor..");
        this.customerService =customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerByID(@PathVariable("customerId")UUID id){
        return new ResponseEntity<>(customerService.getCustomerByID(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO customer = customerService.saveCustomer(customerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/customer/" + customer.getUuid().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@PathVariable("customerId") UUID id, @RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(id,customerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID id){
        customerService.deleteCustomer(id);
    }
}
