package com.starking.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starking.cardapio.domain.Food;

/**
 * @author pedroRhamon
 */
public interface FoodRepository extends JpaRepository<Food, Long>{

}
