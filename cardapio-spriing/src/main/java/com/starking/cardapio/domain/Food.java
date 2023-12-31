package com.starking.cardapio.domain;

import java.io.Serializable;

import com.starking.cardapio.domain.dtos.FoodRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
	
	@NotNull(message = "Imagem title")
	@NotEmpty(message = "Não pode ser vázio")
	private String title;
	
	@NotNull(message = "Imagem obrigatória")
	@NotEmpty(message = "Não pode ser vázio")
	private String image;
	
	@NotNull(message = "Imagem price")
	@NotEmpty(message = "Não pode ser vázio")
	private Integer price;
	
	public Food(FoodRequestDTO data) {
		this.image = data.image();
		this.price = data.price();
		this.title = data.title();
	}
}
