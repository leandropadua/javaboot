package org.leandropadua.knockknock;

import static org.junit.Assert.*;

import org.junit.*;
import org.leandropadua.knockknock.controllers.TriangleTypeController;
import org.leandropadua.knockknock.models.TriangleIdentifier;

public class TriangleTypeTest {

	private TriangleTypeController triangleType = new TriangleTypeController();
	
	@Test
	public void invalidTriangle() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		String expectedType = TriangleIdentifier.INVALID_TRIANGLE;
		assertEquals(expectedType, triangleType.getTriangleType(a, b, c));
	}

	@Test
	public void equilateralTriangle() {
		int a = 2;
		int b = 2;
		int c = 2;
		
		String expectedType = TriangleIdentifier.EQUILATERAL_TRIANGLE;
		assertEquals(expectedType, triangleType.getTriangleType(a, b, c));
	}
	
	@Test
	public void isoscelesTriangle() {
		int a = 2;
		int b = 2;
		int c = 3;
		
		String expectedType = TriangleIdentifier.ISOSCELES_TRIANGLE;
		assertEquals(expectedType, triangleType.getTriangleType(a, b, c));
	}
	
	@Test
	public void scaleneTriangle() {
		int a = 4;
		int b = 2;
		int c = 3;
		
		String expectedType = TriangleIdentifier.SCALENE_TRIANGLE;
		assertEquals(expectedType, triangleType.getTriangleType(a, b, c));
	}
}
