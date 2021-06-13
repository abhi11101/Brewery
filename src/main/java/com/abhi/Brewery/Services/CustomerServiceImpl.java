package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.CustomerDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerByID(UUID uuid) {
        return CustomerDTO.builder().uuid(UUID.randomUUID())
                .name("Rocky")
                .build();
    }
}
