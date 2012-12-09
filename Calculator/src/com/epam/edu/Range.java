package com.epam.edu;

/**
 * Хранение и управления диапазоном значений
 * 
 * @author Denis_Sidorov
 */
public class Range {

	private double begin;
	private double end;
	private double step;	
	
	/**
	 * Проверяет достигнут ли конец диапазона
	 * 
	 * @return false если текущее значение + шаг больше конца диапазона и true если меньше
	 */
	public boolean hasNext() {
		return (begin + step) <= end;
	}
	
	/**
	 * Возвращает текущее + шаг значение
	 * 
	 * @return следующие значение
	 */
	public double next() {
		begin += step;
		
		if (begin > end) {
			throw new ArithmeticException();
		}
		
		return begin;
	}

	public void setBegin(double begin) {
		this.begin = begin;		
	}

	public void setEnd(double end) {
		this.end = end;		
	}

	public void setStep(double step) {
		begin -= step;
		this.step = step;
	}

}
