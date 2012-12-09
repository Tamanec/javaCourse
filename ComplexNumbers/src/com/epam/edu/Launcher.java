package com.epam.edu;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComplexNumber number1 = new ComplexNumber(5, 10);
		ComplexNumber number2 = new ComplexNumber(10, 20);
		
		System.out.println("Комплексные числа: ");
		System.out.println(number1.getAlgebraicView());
		System.out.println(number1.getTrigonometricView());
		System.out.println("");
		
		System.out.println(number2.getAlgebraicView());
		System.out.println(number2.getTrigonometricView());
		System.out.println("");
		
		number1.addition(number2);
		
		System.out.println("a + b: ");
		System.out.println(number1.getAlgebraicView());
		System.out.println(number1.getTrigonometricView());
		System.out.println("");
		
		number1.subtraction(number2);
		
		System.out.println("a - b: ");
		System.out.println(number1.getAlgebraicView());
		System.out.println(number1.getTrigonometricView());
		System.out.println("");
		
		number1.multiplication(number2);
		
		System.out.println("a * b: ");
		System.out.println(number1.getAlgebraicView());
		System.out.println(number1.getTrigonometricView());
		System.out.println("");
		
		number1.division(number2);
		
		System.out.println("a / b: ");
		System.out.println(number1.getAlgebraicView());
		System.out.println(number1.getTrigonometricView());
	}

}
