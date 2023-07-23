package com.starking.cardapio.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.starking.cardapio.domain.dtos.FoodRequestDTO;
import com.starking.cardapio.domain.dtos.FoodResponseDTO;
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

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void saveFood(@RequestBody FoodRequestDTO data) {
		this.foodService.save(data);
	}
	
	@GetMapping
	public List<FoodResponseDTO> getAll() {
		return this.foodService.getAll();
	}
}
