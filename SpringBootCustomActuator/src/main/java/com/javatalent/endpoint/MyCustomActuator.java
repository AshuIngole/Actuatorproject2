package com.javatalent.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id = "myendpoint")
@Component
public class MyCustomActuator {
	@ReadOperation
	@Bean
	public String endPoint() {
		return "Hello This is message from Custom Actuator Endpoint";
	}

}
