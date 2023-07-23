package com.starking.cardapio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pedroRhamon
 */
@RestController
@RequestMapping("/food")
public class FoodController {

	@GetMapping
	public void getAll() {
		
	}
}
