package com.epam.edu;

final public class Fibonachi {
	
	final private int[] fibonachi;
	
	public Fibonachi(int n) {
		fibonachi = new int[n];
		fibonachi[0] = 0;
		fibonachi[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
		}
	}

	public int[] getFibonachi() {
		return fibonachi;
	}

}
