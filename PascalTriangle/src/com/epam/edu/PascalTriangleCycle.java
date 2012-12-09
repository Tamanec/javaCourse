package com.epam.edu;

public class PascalTriangleCycle extends PascalTriangle {	
	
	public PascalTriangleCycle(int n) {
		super(n);
		
		for (int i = 0; i < triangle.length; i++) {
			int rowLength = i + 1;			
			triangle[i] = new int[rowLength];
			
			for (int j = 0; j < rowLength; j++) {
				if ((j == 0) || (j == (rowLength - 1))) {
					triangle[i][j] = CLOSER_NUM;
				} else {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}
		}
	}

	public int[][] getTRIANGLE() {
		return triangle.clone();
	}
	
}
