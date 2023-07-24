package com.starking.cardapio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.starking.cardapio.domain.Food;
import com.starking.cardapio.domain.dtos.FoodRequestDTO;
import com.starking.cardapio.domain.dtos.FoodResponseDTO;
import com.starking.cardapio.repositories.FoodRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author pedroRhamon
 */
@Service
@RequiredArgsConstructor
public class FoodService {

	private final FoodRepository foodRepository;

	public void save(FoodRequestDTO data) {
		Food dataFood = new Food(data);
		this.foodRepository.save(dataFood);
		return;
	}

	public List<FoodResponseDTO> getAll() {
		return this.foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
	}

}
