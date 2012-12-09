package com.epam.edu;

/**
 * Класс для работы с комплексными числами
 * 
 * @author Denis
 */
public class ComplexNumber {
	
	/**
	 * действительная часть комплексного числа 
	 */
	private int realPart;
	
	/**
	 * мнимая часть комплексного числа 
	 */
	private int imaginaryPart;
	
	/**
	 * выполняет арифметические операции с комплексными числами
	 */
	private static ComplexArithmeticable arithmetic = new ComplexArithmetic();
	
	/**
	 * форматирует комплексные числа
	 */
	private static ComplexFormattable formatter = new ComplexFormatter();
		
	/**
	 * @param realPart		действительная часть комплексного числа
	 * @param imaginaryPart мнимая часть комплексного числа
	 * @param arithmetic	объект выполняющий арифметические операции с комплексными числами
	 */
	public ComplexNumber(int realPart, int imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;		
	}

	/**
	 * @return the realPart
	 */
	public int getRealPart() {
		return realPart;
	}

	/**
	 * @param realPart the realPart to set
	 */
	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}

	/**
	 * @return the imaginaryPart
	 */
	public int getImaginaryPart() {
		return imaginaryPart;
	}

	/**
	 * @param imaginaryPart the imaginaryPart to set
	 */
	public void setImaginaryPart(int imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	/**
	 * @return the arithmetic
	 */
	public static ComplexArithmeticable getArithmetic() {
		return arithmetic;
	}

	/**
	 * @param arithmetic the arithmetic to set
	 */
	public static void setArithmetic(ComplexArithmeticable arithmetic) {
		ComplexNumber.arithmetic = arithmetic;
	}

	/**
	 * Прибавляет к текущему числу переданный параметр
	 * 
	 * @param number комплексное число
	 */
	public void addition(ComplexNumber number) {
		ComplexNumber result = arithmetic.addition(this, number);
		
		realPart = result.getRealPart();
		imaginaryPart = result.getImaginaryPart();
	}
	
	/**
	 * Вычитает из текущего числа переданный параметр
	 * 
	 * @param number комплексное число
	 */
	public void subtraction(ComplexNumber number) {
		ComplexNumber result = arithmetic.subtraction(this, number);
		
		realPart = result.getRealPart();
		imaginaryPart = result.getImaginaryPart();
	}
	
	/**
	 * Умножает текущее число на переданный параметр
	 * 
	 * @param number комплексное число
	 */
	public void multiplication(ComplexNumber number) {
		ComplexNumber result = arithmetic.multiplication(this, number);
		
		realPart = result.getRealPart();
		imaginaryPart = result.getImaginaryPart();
	}

	/**
	 * Делит текущее число на переданный параметр
	 * 
	 * @param number комплексное число
	 */
	public void division(ComplexNumber number) {
		ComplexNumber result = arithmetic.division(this, number);
		
		realPart = result.getRealPart();
		imaginaryPart = result.getImaginaryPart();
	}
	
	
	/**
	 * Возвращает строковое представление в алгебраической форме
	 * 
	 * @return строковое представление в алгебраической форме
	 */
	public String getAlgebraicView() {
		return formatter.getAlgebraicView(this);
	}
	
	/**
	 * Возвращает строковое представление в тригонометрической форме
	 * 
	 * @return строковое представление в тригонометрической форме
	 */
	public String getTrigonometricView() {
		return formatter.getTrigonometricView(this);
	}

}
