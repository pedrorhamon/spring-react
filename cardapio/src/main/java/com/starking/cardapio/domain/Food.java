package com.starking.cardapio.domain;

import java.io.Serializable;

import com.starking.cardapio.domain.dtos.FoodRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author pedroRhamon
 */

@Entity(name = "foods")
@Table(name = "foods")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Food implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String title;
	
	private String image;
	
	private Integer price;
	
	public Food(FoodRequestDTO data) {
		this.image = data.image();
		this.price = data.price();
		this.title = data.title();
	}
}
