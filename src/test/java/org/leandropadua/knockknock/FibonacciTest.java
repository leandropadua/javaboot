package org.leandropadua.knockknock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.leandropadua.knockknock.controllers.FibonacciController;

public class FibonacciTest {

	private FibonacciController fiboController = new FibonacciController();

	@Test
	public void fibonacciPositive() { 
		assertEquals(55, fiboController.fibonacci(10));
	}

	@Test
	public void fibonacciNegative() { 
		assertEquals(-55, fiboController.fibonacci(-10));
		assertEquals(89, fiboController.fibonacci(-11));
	}
	
	@Test
	public void fibonacciZero() { 
		assertEquals(0, fiboController.fibonacci(0));
	}
	
}