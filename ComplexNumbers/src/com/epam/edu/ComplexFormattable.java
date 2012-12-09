package com.epam.edu;

/**
 * 
 * 
 * @author Denis
 */
public interface ComplexFormattable {

	/**
	 * Возвращает строковое представление входящего в параметр числа в алгебраической форме
	 * 
	 * @param 	number	комплексное число
	 * @return			строковое представление комплексного числа в алгебраической форме
	 */
	String getAlgebraicView(ComplexNumber number);
	
	/**
	 * Возвращает строковое представление входящего в параметр числа в тригонометрической форме
	 * 
	 * @param 	number	комплексное число
	 * @return			строковое представление комплексного числа в тригонометрической форме
	 */
	String getTrigonometricView(ComplexNumber number);
	
}
