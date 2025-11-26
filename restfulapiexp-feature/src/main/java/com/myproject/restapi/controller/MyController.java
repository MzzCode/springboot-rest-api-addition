package com.myproject.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.restapi.pojo.AddRequest;
import com.myproject.restapi.pojo.AddResponse;

@RestController
@RequestMapping("/MyApi")

public class MyController {
	
	@PostMapping("/Add")
	public AddResponse add (@RequestBody AddRequest request ) {
		
		System.out.println("Incoming Values are: num1 = " +request.getNum1() + ", num2 = " +request.getNum2());
		
		int sum = request.getNum1() + request.getNum2();
		
		System.out.println("Sum: " +sum);
		
		return new AddResponse(request.getNum1(), request.getNum2(), sum);
	}	

}
