package com.starking.cardapio.domain.dtos;

import com.starking.cardapio.domain.Food;

/**
 * @author pedroRhamon
 */

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

	public FoodResponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
	}
}
