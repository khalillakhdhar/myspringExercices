package com.elitech.inhertance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Passenger extends Vehicule{
	private int noOfPassengers;

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	

}
