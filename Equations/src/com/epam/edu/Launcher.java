package com.epam.edu;


/**
 * Создаем объект для решения уравнений, передаем в него разные параметры - получаем разные решения...
 * 
 * @author Denis
 */
public class Launcher {
	
	public static void main(String[] args) {
		
		Equation equation = new Equation(1, 1, 1);
		Result result;
		
		for (int a = 1, b = 1, c = 1; b <= 10; b++) {
						
			equation.setB(b);
			result = equation.getResult();
			
			System.out.println(equation);
			
			if (!result.isComplex()) {
				double pow1 = Math.pow(result.getX1(), 2);
				double pow2 = Math.pow(result.getX2(), 2);
				
				System.out.println("x1 * x1 = " + pow1 + ", x2 * x2 = " + pow2);
			} else {
				ComplexResult complex = (ComplexResult) result;
				System.out.println("Complex result: x1 = " + complex.getX1Complex() + ", x2 = " + complex.getX2Complex());
			}
			
			System.out.println();
		}
		
	}

}
