package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerByID(UUID uuid) {
        return CustomerDTO.builder().uuid(UUID.randomUUID())
                .name("Rocky")
                .build();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID uuid, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(UUID uuid) {
            log.debug("Deleting Customer");
    }
}
