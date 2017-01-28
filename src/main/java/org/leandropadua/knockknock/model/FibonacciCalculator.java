package org.leandropadua.knockknock.model;

public class FibonacciCalculator {

	public long calculate(int n) {
        long n2 = 0;
        long n1 = 1;
        long tmp;
        for (int i=n ; i>2 ; i--) {
            tmp = n2;
            n2 = n1;
            n1 = n1 + tmp;
        }
        return n2 + n1;
	}

}
