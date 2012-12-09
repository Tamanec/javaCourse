package com.epam.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Управляет функциями и режимами вычисления калькулятора
 * 
 * @author Denis_Sidorov
 */
public class Calculator {

	List<Function> functions = new ArrayList<Function>();
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * Добавляет калькулятору функцию
	 * 
	 * @param function
	 */
	public void addFunction(Function function) {
		if (functions.contains(function)) {
			System.err.println("Функция " + function + " уже есть в списке.");
			return;
		}
		
		functions.add(function);
	}
	
	/**
	 * Запускает калькулятор - вывод элементов управления,
	 * запуск выбранных функций
	 */
	public void turnOn() {
		Function choosedFunction = chooseFunction();
		
		if (choosedFunction instanceof ExitFunction) {
			return;
		}
		
		CalculationMode choosedMode = chooseCalculationMode(choosedFunction);
		
		Result result = choosedMode.calculate(choosedFunction);
		System.out.println(result);		
		System.out.println();
		
		turnOn();
	}
	
	/**
	 * Выбор функции для запуска решения
	 * 
	 * @return решаемая функция
	 */
	private Function chooseFunction() {
		Function choosedFunction;
		
		// вывод элементов управления
		for (int i = 0; i < functions.size(); i++) {
			System.out.println((i + 1) + ". " + functions.get(i));
		}
		
		System.out.println("0. Выход");
		System.out.println();
		
		System.out.print("Введите номер функции и нажмите enter: ");		
		int functionNumber = scanner.nextInt();
		
		// проверка корректности выбора
		if (functionNumber == 0) {
			return new ExitFunction();
		} else if (functionNumber > functions.size()) {
			System.out.println();
			System.out.println("Неправильный номер функции.");
			System.out.println();
			choosedFunction = chooseFunction();
		} else {
			choosedFunction = functions.get(functionNumber - 1);
		}
		
		return choosedFunction; 
	}
	
	/**
	 * Выбор режима вычисления из режимов определенных для конкретной функции
	 * 
	 * @param choosedFunction решаемая функция
	 * @return режим вычисления
	 */
	private CalculationMode chooseCalculationMode(Function choosedFunction) {	
		List<CalculationMode> calculationModes = choosedFunction.getCalculationModes();
		CalculationMode choosedMode;
		
		System.out.println("Режимы калькулятора:");		
		int i = 1;
		
		// вывод элементов управления
		for (CalculationMode mode : calculationModes) {
			System.out.println(i++ + ". " + mode);
		}
		
		System.out.println();		
		System.out.print("Введите номер режима: ");		
		int modeNumber = scanner.nextInt();
		
		// проверяем корректность выбора
		if (modeNumber < 1 || modeNumber > calculationModes.size() ) {
			System.out.println();
			System.out.println("Неправильный режим.");
			System.out.println();
			choosedMode = chooseCalculationMode(choosedFunction);
		} else {
			choosedMode = calculationModes.get(modeNumber - 1);
		}
		
		return choosedMode;
	}
	
}
