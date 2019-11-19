package com.example.kiran.luv2code.bootdemoproject.service;

import org.springframework.stereotype.Service;

//@Primary
@Service
public class Dog implements AnimalInterface {

	@Override
	public String characteristics() {
		return "Bark";
	}

	
}
