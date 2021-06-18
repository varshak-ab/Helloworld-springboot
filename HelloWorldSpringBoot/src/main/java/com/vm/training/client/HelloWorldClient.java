package com.vm.training.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldClient {

	@RequestMapping(value="/")
	public String hello()
	{
		return "HELLO WORLD";
	}
}
