package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.BeerDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Alte").build();
    }

}
