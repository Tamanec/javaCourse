package com.epam.edu;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PascalTriangle pt = new PascalTriangleCycle(7);
		int[][] triangle = pt.getTRIANGLE();
		
		for (int[] row : triangle) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println("");
		}

	}

}
