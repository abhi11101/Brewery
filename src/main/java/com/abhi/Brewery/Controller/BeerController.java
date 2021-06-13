package com.abhi.Brewery.Controller;

import java.util.UUID;

import com.abhi.Brewery.Services.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.Brewery.Model.BeerDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/beer")
public class BeerController {

	private final BeerService beerService;

	public BeerController(BeerService beerService){
		this.beerService=beerService;
	}


	@RequestMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID id) {
		System.out.println("In Beer Method");
				return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
	}
}
