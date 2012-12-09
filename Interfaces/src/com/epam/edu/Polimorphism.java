package com.epam.edu;


public class Polimorphism implements Testable {

	private Testable test;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Polimorphism p = new Polimorphism();
		p.setTest(new Test2());
		
		p.test1();
	}
	
	@Override
	public void test1() {
		test.test1();
	}

	public void setTest(Testable test) {
		this.test = test;
	}
	
}

interface Testable {
	void test1();	
}

class Test1 implements Testable {

	@Override
	public void test1() {
		System.out.println("Testable.Test1");
		
	}
	
}

class Test2 implements Testable {

	@Override
	public void test1() {
		System.out.println("Testable.Test2");
		
	}
	
}