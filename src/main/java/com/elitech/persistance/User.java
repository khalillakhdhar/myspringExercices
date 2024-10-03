package com.elitech.persistance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 30)
	private String nom;
	@Column(nullable = false,length = 30)
	private String prenom;
	@Column(nullable = false)
	private String mdp;
	@Column(nullable = false,unique = true)
	
	private String email;
}
