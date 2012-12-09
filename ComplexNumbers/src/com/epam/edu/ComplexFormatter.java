package com.epam.edu;

/**
 * Класс реализующий форматирование комплексных чисел
 * 
 * @author Denis
 */
public class ComplexFormatter implements ComplexFormattable {

	/**
	 * @see com.epam.edu.ComplexFormattable#getAlgebraicView(com.epam.edu.ComplexNumber)
	 */
	@Override
	public String getAlgebraicView(ComplexNumber number) {	
		int x = number.getRealPart();
		int y = number.getImaginaryPart();
		
		return String.format("z = %d + i * %d", x, y);		
	}

	/**
	 * @see com.epam.edu.ComplexFormattable#getTrigonometricView(com.epam.edu.ComplexNumber)
	 */
	@Override
	public String getTrigonometricView(ComplexNumber number) {
		int x = number.getRealPart();
		int y = number.getImaginaryPart();
		
		double r = Math.sqrt(x * x + y * y);
		double f = Math.atan(y / x);  
		
		return String.format("z = %.2f * (cos%.2f + i * sin%.2f)", r, f, f);
	}

}
