package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerID);
    BeerDTO saveBeer(BeerDTO beerDTO);
    void updateBeer(UUID uuid,BeerDTO beerDTO);
    void deleteBeer(UUID uuid);
}
