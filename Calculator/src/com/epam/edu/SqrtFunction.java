package com.epam.edu;

import java.util.Map;

/**
 * Вычисляет функцию корня третьей степени для указанного параметра
 * 
 * @author Denis_Sidorov
 */
public class SqrtFunction extends Function {
	
	/**
	 * Определяет режимы вычисления и параметры функции
	 */
	public SqrtFunction() {
		calculationModes.add(new SingleCalculationMode());
		calculationModes.add(new RangeCalculationMode());
		
		params.add("x");
	}
	
	/**
	 * @see com.epam.edu.Function#calculate(java.util.Map)
	 */
	@Override
	public Result calculate(Map<String, Double> filledParams) {
		double x = filledParams.get("x");
		double result = Math.pow(x, (double) 1/3);
		
		return new SqrtResult(filledParams, result);
	}		

	@Override
	public String toString() {
		return "f(x) = pow(x, 1/3)";
	}
	
	/**
	 *  Хранит результат и параметры с которыми он был получен для SqrtFuntion
	 * 
	 * @author Denis_Sidorov
	 */
	protected class SqrtResult extends Result {
		
		/**
		 * @see com.epam.edu.Result#Result
		 */
		public SqrtResult(Map<String, Double> params, double result) {
			super(params, result); 
		}

		@Override
		public String toString() {
			return String.format("pow(%.2f, 1/3) = %.2f", params.get("x"),  result);
		}
		
	}	

}
