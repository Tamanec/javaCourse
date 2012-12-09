package com.epam.edu;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// создаем калькулятор
		Calculator calc = new Calculator();
		
		// определяем его функции
		calc.addFunction(new CosFunction());
		calc.addFunction(new SqrtFunction());
		
		// запускаем
		calc.turnOn();
		
	}

}
