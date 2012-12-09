package com.epam.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


/**
 * Режим решения функции в диапазоне значений
 * Выбирается определенный параметр для которого задается диапазон
 * затем функция вычисляется несколько раз для каждого значения параметра
 * на определенном диапазоне с указанным шагом
 * 
 * @author Denis_Sidorov
 */
public class RangeCalculationMode extends CalculationMode {
	
	/**
	 * Диапазонный параметр
	 */
	String rangeParam;
	
	/**
	 * Диапазон значений
	 */
	Range range = new Range();
	
	/**
	 * @see com.epam.edu.CalculationMode#readParams(java.util.Set)
	 */
	@Override
	protected Map<String, Double> readParams(Set<String> params) {
		Map<String, Double> filledParams = new HashMap<String, Double>();
		
		// ввод параметров
		for (String param : params) {
			if (param.equals(rangeParam)) {
				filledParams.put(param, 0d);
				continue;
			}
			
			System.out.print("Введите параметр " + param + " и нажмите enter: ");
			filledParams.put(param, scanner.nextDouble());
			System.out.println();
		}
		
		return filledParams;
	}
	
	/**
	 * Определение диапазона
	 */
	protected void initRange() {
		System.out.print("Нижняя граница диапазона значений: ");
		range.setBegin(scanner.nextDouble());
		
		System.out.print("Верхняя граница диапазона значений: ");
		range.setEnd(scanner.nextDouble());
		
		System.out.print("Шаг диапазона: ");
		range.setStep(scanner.nextDouble());
	}
	
	/**
	 * Определяем диапазонный параметр
	 * 
	 * @param params параметры решаемой функции
	 */
	public void chooseRangeParam(Set<String> params) {
		if (params.size() == 1) {
			rangeParam = params.iterator().next();
			return;
		}
		
		System.out.println("Выберите диапазонный параметр:");
		
		for (String param : params) {
			System.out.println(param);
		}
		
		System.out.print("Параметр: ");
		rangeParam = scanner.next();
		System.out.println();
		
		if (!params.contains(rangeParam)) {
			System.out.println();
			System.out.println("Неверно указан параметр.");
			System.out.println();
						
			chooseRangeParam(params);
		}
	}
	
	/**
	 * @see com.epam.edu.CalculationMode#calculate(com.epam.edu.Function)
	 */
	@Override
	public Result calculate(Function function) {
		chooseRangeParam(function.getParams());
		initRange();		
		Map<String, Double> filledParams = readParams(function.getParams());
		
		RangeResult results = new RangeResult(filledParams, 0d);
		
		while (range.hasNext()) {			
			Map<String, Double> currentParams = new HashMap<String, Double>(filledParams);
			currentParams.put(rangeParam, range.next());
			results.addResult(function.calculate(currentParams));
		}	
		
		return (Result) results;
	}
	
	@Override
	public String toString() {
		return "Диапазон значений";
	}
	
	/**
	 * Хранит решения определенной функции
	 * 
	 * @author Denis_Sidorov
	 */
	protected class RangeResult extends Result {
		
		/**
		 * Список решений
		 */
		Set<Result> results = new LinkedHashSet<Result>();
		
		Iterator<Result> iterator = results.iterator();
		
		/**
		 * @see com.epam.edu.Result#Result
		 */
		public RangeResult(Map<String, Double> params, double result) {
			super(params, result);
		}		
		
		/**
		 * Добавляет результат вычисления в список результатов
		 * 
		 * @param result результат вычисления
		 */
		public void addResult(Result result) {
			results.add(result);
		}
		
		/**
		 * Проверяет есть ли еще решения
		 * 
		 * @return true если перебрали не все результаты
		 */
		public boolean hasNext() {
			return iterator.hasNext();
		}
		
		/**
		 * Возвращает решение из списка решений на определенном диапазоне
		 */
		@Override
		public double getResult() {
			Result currentResult = iterator.next();			
			return currentResult.getResult();
		}

		@Override
		public String toString() {
			StringBuilder view = new StringBuilder();
			
			for (Result result : results) {
				view.append(result).append('\n');
			}			
			
			return view.toString();
		}
	}
	
}