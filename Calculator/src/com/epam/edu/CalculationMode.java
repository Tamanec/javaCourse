package com.epam.edu;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 * Режим вычисления определяет способ запуска функции и инициализацию ее параметров
 * 
 * @author Denis_Sidorov
 */
abstract public class CalculationMode {
		
	protected Scanner scanner = new Scanner(System.in);
	
	/**
	 * Заполнение параметров функции
	 * 
	 * @param params параметры функции
	 * @return определенные пользователем параметры
	 */
	abstract protected Map<String, Double> readParams(Set<String> params);
	
	/**
	 * Запуск вычисления функции
	 * 
	 * @param function решаемая функция
	 * @return результат вычисления
	 */
	abstract public Result calculate(Function function);	
	
}