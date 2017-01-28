package org.leandropadua.knockknock.controllers;

import org.leandropadua.knockknock.model.FibonacciCalculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
	
	@RequestMapping("/api/Fibonacci")
	public long fibonacci(@RequestParam(required=true,name="n") int n) {		
		
		if (n == 0) {
			return 0;
		}
		
		FibonacciCalculator fibo = new FibonacciCalculator();
		long positiveFibonacci =  fibo.calculate(Math.abs(n));
		
		if (n > 0) {
			return positiveFibonacci;
		}
		
		int negativeFactor = (int) Math.pow(-1, Math.abs(n) + 1);
		
		return negativeFactor * positiveFibonacci;
		
	}
}
