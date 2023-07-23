package com.starking.cardapio.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starking.cardapio.domain.Food;
import com.starking.cardapio.services.FoodService;

import lombok.RequiredArgsConstructor;

/**
 * @author pedroRhamon
 */
@RestController
@RequestMapping("food")
@RequiredArgsConstructor
public class FoodController {

	private final FoodService foodService;

	@GetMapping
	public List<Food> getAll() {
		return this.foodService.getAll();
	}
}
