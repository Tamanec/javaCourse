package com.epam.edu;

/**
 * Класс выполняющий арифметические операции над комплексными числами
 * 
 * @author Denis
 */
public class ComplexArithmetic implements ComplexArithmeticable {
	
	/**
	 * @see com.epam.edu.ComplexArithmeticable#addition()
	 */
	@Override
	public ComplexNumber addition(ComplexNumber number1, ComplexNumber number2) {
		int realPart = number1.getRealPart() + number2.getRealPart();
		int imaginaryPart = number1.getImaginaryPart() + number2.getImaginaryPart();
		
		return new ComplexNumber(realPart, imaginaryPart);
	}

	/**
	 * @see com.epam.edu.ComplexArithmeticable#subtraction()
	 */
	@Override
	public ComplexNumber subtraction(ComplexNumber number1, ComplexNumber number2) {
		int realPart = number1.getRealPart() - number2.getRealPart();
		int imaginaryPart = number1.getImaginaryPart() - number2.getImaginaryPart();
		
		return new ComplexNumber(realPart, imaginaryPart);
	}

	/**
	 * @see com.epam.edu.ComplexArithmeticable#multiplication()
	 */
	@Override
	public ComplexNumber multiplication(ComplexNumber number1, ComplexNumber number2) {		
		int x = number1.getRealPart();			// действительная часть первого числа
		int y = number1.getImaginaryPart();		// мнимая часть первого числа
		int a = number2.getRealPart();			// действительная часть второго числа
		int b = number2.getImaginaryPart();		// мнимая часть второго числа	
		
		int realPart = x * a - y * b;
		int imaginaryPart = x * b + y * a;
		
		return new ComplexNumber(realPart, imaginaryPart);
	}

	/**
	 * @see com.epam.edu.ComplexArithmeticable#division()
	 */
	@Override
	public ComplexNumber division(ComplexNumber number1, ComplexNumber number2) {
		int x = number1.getRealPart();			// действительная часть первого числа
		int y = number1.getImaginaryPart();		// мнимая часть первого числа
		int a = number2.getRealPart();			// действительная часть второго числа
		int b = number2.getImaginaryPart();		// мнимая часть второго числа	
		
		int realPart = Math.round((x * a + y * b) / (a * a + b * b));
		int imaginaryPart = Math.round((y * a - x * b) / (a * a + b * b));
		
		return new ComplexNumber(realPart, imaginaryPart);
	}

}
