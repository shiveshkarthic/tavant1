package com.handson.pnbbank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/actuator/info")
	public String startingInfo() {
		return "Hey!! This is the PNB Bank Service";
	}
	

}
