package com.demo.vizceral.service_m.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String fetchAll() {
		return "address";
	}
}
