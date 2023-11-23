package com.capgemini.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping<apping>
	 String hi() {
		return "Hello world";
	}
}
