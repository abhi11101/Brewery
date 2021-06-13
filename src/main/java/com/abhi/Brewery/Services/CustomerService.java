package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {

    CustomerDTO getCustomerByID(UUID uuid);
}
