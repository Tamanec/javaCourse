package com.epam.edu;

/**
 * Р“РµРЅРµСЂР°С†РёСЏ С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё С†РёРєР»РѕРј
 * @author Denis
 *
 */
final public class FibonachiGeneratorCycle extends FibonachiGenerator {	

	public FibonachiGeneratorCycle(int n) {
		super(n);
	}

	/** 
	 * @see com.epam.edu.FibonachiGenerator#populate(int)
	 */
	protected void populate(int n) {
		for (int i = 2; i < n; i++) {
			fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
		}
	}

}
