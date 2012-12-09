package com.epam.edu;

/**
 * Результат уравнения
 * Меняется в зависимости от значения дискриминанта
 * 
 * @author Denis
 */
public abstract class Result {
	
	/**
	 * Первое решение уравнения
	 */
	protected double x1;
	
	/**
	 * Второе решение уравнения 
	 */
	protected double x2;
	
	/**
	 * Расчитывает первое решение
	 * 
	 * @return x1                  решение уравнения
	 * @throws ArithmeticException при отрицательном дискриминанте решением явлются комплексные числа
	 */		
	public abstract double getX1() throws ArithmeticException;
	
	/**
	 * Расчитывает второе решение
	 * 
	 * @return x2                  решение уравнения
	 * @throws ArithmeticException при отрицательном дискриминанте решением явлются комплексные числа
	 */
	public abstract double getX2() throws ArithmeticException;
	
	/**
	 * @return флаг комплексного числа
	 */
	public abstract boolean isComplex();
	
}
