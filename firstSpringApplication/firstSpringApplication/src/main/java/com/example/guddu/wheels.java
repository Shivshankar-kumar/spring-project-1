package com.example.guddu;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component
@Scope("prototype")
public class wheels {

	private int numberOfWheels=4;

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	
}
