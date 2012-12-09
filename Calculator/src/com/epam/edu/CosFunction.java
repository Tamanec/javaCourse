package com.epam.edu;

import java.util.Map;


/**
 * Вычисляет функцию косинуса для указанного параметра
 * 
 * @author Denis_Sidorov
 */
public class CosFunction extends Function {
	
	/**
	 * Определяет режимы вычисления и параметры функции
	 */
	public CosFunction() {
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
		double result =  Math.cos(x);
		
		return new CosResult(filledParams, result);
	}		

	@Override
	public String toString() {
		return "f(x) = Cos(x)";
	}
	
	/**
	 * Хранит результат и параметры с которыми он был получен для CosFuntion
	 * 
	 * @author Denis_Sidorov
	 */
	protected class CosResult extends Result {
		
		/**
		 * @see com.epam.edu.Result#Result
		 */
		public CosResult(Map<String, Double> params, double result) {
			super(params, result);
		}

		@Override
		public String toString() {
			return String.format("Cos(%.2f) = %.2f", params.get("x"),  result);
		}
		
	}
	
}
