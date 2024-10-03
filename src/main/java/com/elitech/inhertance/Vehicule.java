package com.elitech.inhertance;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Vehicule {

	@Id
	private int id;
	private String manifacturer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	
	
	
}
