package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SbaController {
	

	/*
	 * %s = placeholder of the runtime value
	 * 
	 * eg, if user input : "abcd" result will be "Hello, abcd"
	 */
	
	private static final String template = "Avinash, %s!";
	
    //AtomicLong is a datatype that will handle huge data
	private final AtomicLong atomicLong = new AtomicLong();

	
	
	@GetMapping("/greeting")
	public Sba greeting(@RequestParam(value = "name", defaultValue = "Here") String name) {
		return new Sba(atomicLong.incrementAndGet(), String.format(template, name));
	}
}