package org.leandropadua.knockknock.controllers;

import org.leandropadua.knockknock.models.FibonacciCalculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
	
	@RequestMapping("/api/Fibonacci")
	public long fibonacci(@RequestParam(required=true,name="n") int n) {		
		
		//Treat zero case
		if (n == 0) {
			return 0;
		}
		
		//Non zero case
		FibonacciCalculator fibo = new FibonacciCalculator();
		long positiveFibonacci =  fibo.calculate(Math.abs(n));
		
		//When input is positive, calculate Fibonacci normally
		if (n > 0) {
			return positiveFibonacci;
		}
		
		//When input is negative, multiply the result by -1 when input is even
		int negativeFactor = (int) Math.pow(-1, Math.abs(n) + 1);
		return negativeFactor * positiveFibonacci;
	}
}
