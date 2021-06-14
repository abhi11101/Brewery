package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerByID(UUID uuid);
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(UUID uuid, CustomerDTO customerDTO);
    void deleteCustomer(UUID uuid);
}
