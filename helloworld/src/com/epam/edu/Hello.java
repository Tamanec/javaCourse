package com.epam.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Apple> fruits;
		List<Apple> apples = new ArrayList<Apple>(Arrays.asList(new Apple(1), new Apple(2), new Apple(3)));
		
		System.out.println(apples);
		
		
		fruits = apples;
		
		fruits.add(new Apple(4));
		
		System.out.println(apples);
		System.out.println(fruits);
		
	}
	
	static void test(List<? super Fruit> fruits, Apple f) {
		fruits.add(f);
	}
 
}


class Fruit {
	int a;
	
	public Fruit(int a) {
		this.a = a;		
	}

	@Override
	public String toString() {
		return "" + a;
	}
	
}

class Apple extends Fruit {
	int a;
	
	public Apple(int a) {	
		super(a);
		this.a = a;	
	}

	@Override
	public String toString() {
		return "" + a;
	}	
	
}