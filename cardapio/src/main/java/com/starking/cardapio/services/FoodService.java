package com.starking.cardapio.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public ResponseEntity<FoodResponseDTO> save(@RequestBody FoodResponseDTO dto) {
		this.foodRepository.save(dto);
	}
	
	public List<FoodResponseDTO> getAll() {
		return this.foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
	}
	
}
