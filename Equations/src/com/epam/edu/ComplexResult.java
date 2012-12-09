package com.epam.edu;

/**
 * Результат уравнения при отрицательном дискриминанте
 * Решения уравнения являются комплексными числами
 * 
 * @author Denis
 */
public class ComplexResult extends Result {		
	
	/**
	 * @see com.epam.edu.Equation.Result#getX1()
	 */
	@Override
	public double getX1() {
		throw new ArithmeticException("Результат является комплексным числом");
	}

	/**
	 * @see com.epam.edu.Equation.Result#getX2()
	 */
	@Override
	public double getX2() {
		throw new ArithmeticException("Результат является комплексным числом");
	}
	
	/**
	 * Возвращает комплексное представление первого решения
	 * 
	 * @return комплексное число
	 */
	public String getX1Complex() {
		return "Комплексное представление x1";
	}
	
	/**
	 * Возвращает комплексное представление первого решения
	 * 
	 * @return комплексное число
	 */
	public String getX2Complex() {
		return "Комплексное представление x2";
	}

	/**
	 * @see com.epam.edu.Result#isComplex()
	 */
	@Override
	public boolean isComplex() {		
		return true;
	}

	@Override
	public String toString() {
		return "x1=complex, x2=complex";
	}
	
}