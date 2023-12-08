package com.javatalent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// if you want to secure endpoints then goes to this way:http://localhost:8080/actuator/metrics
//if you want to information about info endpoints then goes to this way:if you want to secure endpoints then goes to this way:
//http://localhost:8080/actuator/info
// to hit endpoint:http://localhost:8080/actuator
// to hit custom endpoint:http://localhost:8080/actuator/myendpoint
public class CustomeActuatorExample {
	@GetMapping("/hello")
	public String printMessage() {
		return "Hello All Welcome to javaTalent";
	}

}
