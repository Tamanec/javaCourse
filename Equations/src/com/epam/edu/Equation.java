package com.epam.edu;

/**
 * Решение квадратных уравнений
 * 
 * @author Denis
 */
public class Equation {

	/**
	 * Первый параметр квадратного уравнения 
	 */
	private int a;
	
	/**
	 * Второй параметр квадратного уравнения 
	 */
	private int b;
	
	/**
	 * Третий параметр квадратного уравнения 
	 */
	private int c;
		
	/**
	 * Дискриминант уравнения 
	 */
	private Discriminant discriminant = new Discriminant(); 
	
	public Equation(int a, int b, int c) {
		setA(a);
		this.b = b;
		this.c = c;
	}

	/**
	 * Задает параметр уравнения "a"
	 * Обнуляет решение уравнения
	 * 
	 * @param a
	 * @throws IllegalArgumentException "a" не может равняться нулю
	 */
	public void setA(int a) {
		if (a == 0) {
			throw new IllegalArgumentException("Аргумент \"a\" не должен быть равен нулю.");
		}
		
		this.a = a;		
	}

	/**
	 * Задает параметр уравнения "b"
	 * Обнуляет решение уравнения
	 * 
	 * @param b
	 */
	public void setB(int b) {
		this.b = b;		
	}

	/**
	 * Задает параметр уравнения "c"
	 * Обнуляет решение уравнения
	 * 
	 * @param c
	 */
	public void setC(int c) {
		this.c = c;		
	}
	
	/**
	 * Расчитывает дискриминант квадратного уравнения
	 * 
	 * @return дискриминант
	 */
	public double getDiscriminant() {
		return discriminant.calculate();
	}
	
	/**
	 * Запускает решение уравнения и возвращает результат 
	 * 
	 * @return решение уравнения
	 */
	public Result getResult() {
		double d = discriminant.calculate();
		
		// Решение зависит от дискриминанта
		if (d < 0) {
			return new ComplexResult();
		} else if (d == 0) {
			return new EqualResult(a, b);
		} else {
			return new TwoResult(a, b, d);
		}
	}
	
	/**
	 * Общий вид квадратного уравнения
	 * Дискриминант
	 * Решения
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder view = new StringBuilder(20);
		
		view.append(a).append("x² + ").append(b).append("x + ").append(c).append(" = 0\n")
			.append(discriminant)
			.append("\n").append(getResult());
		
		return view.toString();
	}

	/**
	 * Расчет дискриминанта
	 * 
	 * @author Denis
	 */
	private class Discriminant {
		
		/**
		 * Расчитывает значения дискриминанта
		 * Использует поля внешнего класса
		 * 
		 * @return дискриминант
		 */
		public double calculate() {
			return Math.pow(b, 2) - 4 * a * c;
		}

		@Override
		public String toString() {
			return "D = " + calculate();
		}
		
	}
	
}
