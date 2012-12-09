package com.epam.edu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Режим решения функции по единожды установленным параметрам
 * Заполняет параметры функции и запускает вычисление
 * 
 * @author Denis_Sidorov
 */
public class SingleCalculationMode extends CalculationMode {

	/**
	 * @see com.epam.edu.CalculationMode#readParams(java.util.Set)
	 */
	@Override
	protected Map<String, Double> readParams(Set<String> params) {
		Map<String, Double> filledParams = new HashMap<String, Double>();
		
		for (String param : params) {
			System.out.print("Введите параметр " + param + " и нажмите enter: ");
			filledParams.put(param, scanner.nextDouble());
			System.out.println();
		}
		
		return filledParams;
	}
	
	/**
	 * @see com.epam.edu.CalculationMode#calculate(com.epam.edu.Function)
	 */
	@Override
	public Result calculate(Function function) {
		Map<String, Double> filledParams = readParams(function.getParams());		
		
		return function.calculate(filledParams);
	}

	@Override
	public String toString() {
		return "Стандартный";
	}
	
}