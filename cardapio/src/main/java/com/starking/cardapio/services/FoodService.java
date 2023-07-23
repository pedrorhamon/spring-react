package com.starking.cardapio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.starking.cardapio.domain.Food;
import com.starking.cardapio.repositories.FoodRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author pedroRhamon
 */
@Service
@RequiredArgsConstructor
public class FoodService {

	private final FoodRepository foodRepository;
	
	public List<Food> getAll() {
		return this.foodRepository.findAll();
	}
	
}
