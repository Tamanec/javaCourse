package com.epam.edu;

/**
 * Рассчет трегольника Паскаля
 * 
 * @author Denis
 */
abstract public class PascalTriangle {
	
	/**
	 * Треугольник Паскаля
	 */
	protected int[][] triangle;
	
	
	/**
	 *  
	 */
	final static int CLOSER_NUM = 1;
	
	public PascalTriangle(int n) {
		triangle = new int[n][];
	}

	/**
	 * Возвращает копию массива с данными о треугольнике Паскаля
	 * 
	 * @return треугольник Паскаля
	 */
	public int[][] getTRIANGLE() {
		return triangle.clone();
	}
	
}
