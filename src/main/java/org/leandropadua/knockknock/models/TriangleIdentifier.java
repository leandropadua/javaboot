package org.leandropadua.knockknock.models;

public class TriangleIdentifier {

	public static final String INVALID_INPUT = "\"Error\"";
	public static final String INVALID_TRIANGLE = "\"Error\"";
	public static final String EQUILATERAL_TRIANGLE = "\"Equilateral\"";
	public static final String ISOSCELES_TRIANGLE = "\"Isosceles\"";
	public static final String SCALENE_TRIANGLE = "\"Scalene\"";

	public static String identifyTriangleType(int a, int b, int c) {

        //Error message in case of negative values or zeros
        if (a <= 0 || b <= 0 || c <= 0) {
            return INVALID_INPUT;
        }
        
        //Error message in case it is not a triangle
        if (a+b <= c || a+c <= b || b+c <= a) {
            return INVALID_TRIANGLE;
        }
        
        //Equilateral
        if(a == b && a == c) {
            return EQUILATERAL_TRIANGLE;
        }
        
        //Isosceles (it must come after equilateral)
        if(a == b || a == c || b == c) {
            return ISOSCELES_TRIANGLE;
        }        

        //Scalene
        if(a != b && a != c && b != c) {
            return SCALENE_TRIANGLE;
        }
        
        //All the other cases should return an error
        return INVALID_TRIANGLE;
	}

}
