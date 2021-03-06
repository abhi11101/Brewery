package com.abhi.Brewery.Model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;

}
