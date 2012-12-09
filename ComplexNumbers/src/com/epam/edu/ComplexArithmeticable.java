package com.epam.edu;

/**
 * Интерфейс арифметических операций над комплексными числами
 * 
 * @author Denis
 */
public interface ComplexArithmeticable {
	
	/**
	 * Сложение комплексных чисел
	 * 
	 * @param 	number1	комплексное число 
	 * @param 	number2	комплексное число
	 * @return			сумма входящих параметров
	 */
	ComplexNumber addition(ComplexNumber number1, ComplexNumber number2);
		
	/**
	 * Вычитание комплексных чисел
	 * 
	 * @param 	number1	комплексное число 
	 * @param 	number2	комплексное число
	 * @return			разность входящих параметров
	 */
	ComplexNumber subtraction(ComplexNumber number1, ComplexNumber number2);
	
	/**
	 * Умножение комплексных чисел
	 * 
	 * @param 	number1	комплексное число 
	 * @param 	number2	комплексное число
	 * @return			произведение входящих параметров
	 */
	 ComplexNumber multiplication(ComplexNumber number1, ComplexNumber number2);
	
	 /**
	 * Деление комплексных чисел
	 * 
	 * @param 	number1	комплексное число 
	 * @param 	number2	комплексное число
	 * @return			результат деления входящих параметров
	 */
	ComplexNumber division(ComplexNumber number1, ComplexNumber number2);

}
