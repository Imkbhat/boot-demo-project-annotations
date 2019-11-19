package com.example.kiran.luv2code.bootdemoproject.service;

import org.springframework.stereotype.Service;

@Service //by removing @service annotation also we can avoid bean ambiguous error
public class Cat implements AnimalInterface {
	
	@Override
	public String characteristics() {
		return "Meow";
	}
}
