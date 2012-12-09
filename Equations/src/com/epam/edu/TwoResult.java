package com.epam.edu;

/**
 * Результат уравнения при положительном дискриминанте
 * Уравнение имеет два решения
 * 
 * @author Denis
 */
public class TwoResult extends Result {
	
	/**
	 * Расчет решений уравнения
	 * 
	 * @param a            первый аргумент уравнения
	 * @param b            второй аргумент уравнения
	 * @param discriminant дискриминант уравнения
	 */
	public TwoResult(int a, int b, double discriminant) {
		x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
		x2 = (-b - Math.sqrt(discriminant)) / 2 * a;
	}

	/**
	 * @see com.epam.edu.Equation.Result#getX1()
	 */
	@Override
	public double getX1() {			
		return x1;
	}

	/**
	 * @see com.epam.edu.Equation.Result#getX2()
	 */
	@Override
	public double getX2() {
		return x2;
	}

	/**
	 * @see com.epam.edu.Result#isComplex()
	 */
	@Override
	public boolean isComplex() {	
		return false;
	}

	@Override
	public String toString() {
		return "x1 = " + x1 + ", x2 = " + x2;
	}
	
}