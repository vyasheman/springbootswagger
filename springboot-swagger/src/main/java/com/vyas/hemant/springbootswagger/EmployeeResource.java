package com.vyas.hemant.springbootswagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class EmployeeResource {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {		
		return hello;
	}
	
	@PutMapping("/put") 
	public String helloPut(@RequestBody final String hello){
		return hello;
	}
}
