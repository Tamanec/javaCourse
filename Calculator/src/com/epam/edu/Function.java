package com.epam.edu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Определяет режимы вычисления, параметры и алгоритм решения функции, 
 * а также возвращаемый результат
 * 
 * @author Denis_Sidorov
 */
abstract public class Function {
		
	/**
	 * Список режимов вычисления
	 */
	protected List<CalculationMode> calculationModes = new LinkedList<CalculationMode>();
	
	/**
	 * Параметры функции
	 */
	protected Set<String> params = new HashSet<String>();
	
	/**
	 * Запускает решение функции
	 * 
	 * @param params заполненные параметры
	 * @return результат вычисления
	 */
	abstract public Result calculate(Map<String, Double> params);
	
	/**
	 * Возвращает список режимов вычисления
	 * 
	 * @return режимы вычисления
	 */
	public List<CalculationMode> getCalculationModes() {
		return new LinkedList<CalculationMode>(calculationModes);
	}
	
	/**
	 * Возвращает список параметров функции
	 * 
	 * @return параметры функции
	 */
	public Set<String> getParams() {		
		return new HashSet<String>(params); 
	}
	
}
