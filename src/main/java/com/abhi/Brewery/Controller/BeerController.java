package com.abhi.Brewery.Controller;

import java.util.UUID;

import com.abhi.Brewery.Services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.abhi.Brewery.Model.BeerDTO;

@RestController
@RequestMapping("/api/beer")
public class BeerController {

	private final BeerService beerService;

	public BeerController(BeerService beerService){
		this.beerService=beerService;
	}


	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID id) {
		System.out.println("In Beer Method");
				return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity saveBeer(@RequestBody BeerDTO beerDTO){
		BeerDTO beer = beerService.saveBeer(beerDTO);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location","/api/beer/" + beer.getId().toString());
		return new ResponseEntity(headers,HttpStatus.CREATED);
	}

	@PutMapping("/{beerId}")
	public ResponseEntity updateBeer(@PathVariable("beerId") UUID id, @RequestBody BeerDTO beerDTO){
		beerService.updateBeer(id,beerDTO);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerId") UUID id){
		beerService.deleteBeer(id);
	}
}
