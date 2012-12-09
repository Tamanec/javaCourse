package com.epam.edu;

import java.util.HashMap;
import java.util.Map;

/**
 * Хранит результат и параметры с которыми он был получен
 * 
 * @author Denis_Sidorov
 */
abstract public class Result {
	
	/**
	 * Список параметров для которых был получен текущий результат
	 */
	final protected Map<String, Double> params;
	
	/**
	 * Результат решения
	 */
	final protected double result;
	
	/**
	 * Определение результата и параметров
	 * 
	 * @param params заданные параметры
	 * @param result результат вычисления
	 */
	public Result(Map<String, Double> params, double result) {
		this.params = params;
		this.result = result;
	}
	
	/**
	 * Возвращает список параметров для которых был получен текущий результат
	 * 
	 * @return параметры
	 */
	public Map<String, Double> getParams() {		
		return new HashMap<String, Double>(params);
	}
	
	/**
	 * Возвращает результат решения
	 * 
	 * @return результат решения
	 */
	public double getResult() {
		return result;
	}
	
}
