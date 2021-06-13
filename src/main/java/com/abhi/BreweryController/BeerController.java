package com.abhi.BreweryController;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.Brewery.Model.BeerDTO;

@Controller
@RequestMapping("/api")
public class BeerController {

	@RequestMapping("/{beerId}")
	public BeerDTO getBeer(@PathVariable("beerId") UUID id) {
		return new BeerDTO();
	}
}
