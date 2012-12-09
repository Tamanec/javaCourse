package com.epam.edu;

import java.util.Random;

public class Cube {
	
	private static Random random = new Random();
	
	/**
	 * Количество сторон
	 */
	private int sides = 6;
	
	public Cube(int sides) {
		this.sides = sides;
	}
	
	/**
	 * Генерирует случайно число от 1 до sides
	 * 
	 * @return случайное число
	 */
	public int getNumber() {
		return (random.nextInt(sides - 1) + 1);
	}

}
