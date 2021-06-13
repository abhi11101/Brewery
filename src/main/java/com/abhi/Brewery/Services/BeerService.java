package com.abhi.Brewery.Services;

import com.abhi.Brewery.Model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {

    BeerDTO getBeerById(UUID beerID);
}
