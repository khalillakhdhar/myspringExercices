package com.elitech.persistance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	@NotBlank
	private String titre;
	@Column(nullable = false,unique = true,length = 30)
	private String formateur;
	@Column(nullable = false)
	@Min(value = 1)
	private int duree;
	@Column(length = 100)
	private String description;
}
