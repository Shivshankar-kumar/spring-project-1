package com.example.guddu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstSpringApplication.class, args);
		
		car c1=context.getBean(car.class);
		//System.out.println(c1);
		
		c1.setName("Safari");
		c1.setCarNumber("Hr-Bs49076");
		c1.setColor("Brown");
		
//		car c2=context.getBean(car.class);
//		System.out.println(c2);
//		
//		car c3=context.getBean(car.class);
//		System.out.println(c3);
		
		System.out.println("Car Name: "+c1.getName()+"\n"+" Car Number: "+c1.getCarNumber()+"\n"+" Color: "+c1.getColor());
		System.out.println("Engine Name: "+c1.getEng().engName);
		System.out.println("Engine no: "+c1.getEng().engNumber);
		System.out.println("Number of Wheels: "+c1.getWh().getNumberOfWheels());
		
	}

}
