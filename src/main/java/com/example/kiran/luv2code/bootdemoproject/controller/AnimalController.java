package com.example.kiran.luv2code.bootdemoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kiran.luv2code.bootdemoproject.service.AnimalInterface;

@RestController
public class AnimalController {
	
	//@Qualifier("dog") //Auto wired by qualifier
	private AnimalInterface animal;
	
	
	@Autowired(required = false) //Constructor Injection (Imp: Constructor injection autowired is Mandatory, in setter its optional)
	public AnimalController(@Qualifier("dog") AnimalInterface animal) {
		this.animal = animal;
	}
	
	@Autowired //AutoWired by setter Injection
	public void setAnimal(@Qualifier("dog") AnimalInterface animal) {
		this.animal = animal;
	}
	
	//Major Difference between Constructor and Setter Injection
	//Constructor Injections are Mandatory Dependencies, Where as setter Injections are Non Mandatory Dependencies*
	
	//@Autowired autoWired by Name
	//private AnimalInterface dog;
	
	//on top of Service bean, we can use @Primary, that also autowired based on Priority

	@GetMapping("/hello")
	public String getHelloFromAnimal() {
		return animal.characteristics();
	}
	
}

//refer: https://www.youtube.com/watch?v=2YC5pIXR7e4