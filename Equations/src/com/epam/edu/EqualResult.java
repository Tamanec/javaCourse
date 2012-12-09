package com.epam.edu;

/**
 * Результат уравнения при дискриминанте равном нулю
 * Решения уравнения равны
 * 
 * @author Denis
 */
public class EqualResult extends Result {
	
	/**
	 * Расчет решений уравнения
	 * 
	 * @param a первый аргумент уравнения
	 * @param b второй аргумент уравнения
	 */
	public EqualResult(int a, int b) {
		x1 = x2 = -b / 2 * a;
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
		return "x1 = x2 = " + x2;
	}
}
