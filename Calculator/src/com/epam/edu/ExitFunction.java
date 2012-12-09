package com.epam.edu;

import java.util.Map;

/**
 * Функция остановки калькулятора
 * 
 * @author Denis_Sidorov
 */
public class ExitFunction extends Function {

	@Override
	public Result calculate(Map<String, Double> params) {			
		throw new UnsupportedOperationException("Выход из калькулятора");
	}

}
