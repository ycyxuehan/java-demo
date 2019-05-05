package com.awko.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping(path="/",method=RequestMethod.POST)
	public String homePost() {
		return "Hello World!";
	}
	
	@RequestMapping(path="/",method=RequestMethod.PUT)
	public String homePut() {
		return "Hello World!";
	}
	
	@RequestMapping(path="/",method=RequestMethod.DELETE)
	public String homeDel() {
		return "Hello World!";
	}
}
