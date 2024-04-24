package com.example.guddu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class car {

	public car() {
		System.out.println("Car Class");
	}
	private String name;
	
	private String carNumber;
	
	private String color;
	
	//here this annotation is used for inject another class
	@Autowired
	private engine eng;
	
	@Autowired
	private wheels wh;
	//setters and getters

	public wheels getWh() {
		return wh;
	}

	public void setWh(wheels wh) {
		this.wh = wh;
	}

	public engine getEng() {
		return eng;
	}

	public void setEng(engine eng) {
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
//	public String toString() {
//		return "CarName: "+name+" Number: "+carNumber+" Color: "+color;
//	}
}
