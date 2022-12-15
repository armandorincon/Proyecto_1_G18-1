package com.unab.app.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	public String getPrueba() {
		System.out.println("prueba Servicio");
		return "Test Service";
		
    }
}
	
	
