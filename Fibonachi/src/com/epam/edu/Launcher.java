package com.epam.edu;


/**
 * РўРµСЃС‚ РєР»Р°СЃСЃР° С„РёР±РѕРЅР°С‡Рё
 * @author Denis
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FibonachiGenerator fi = new FibonachiGeneratorCycle(10);
		//FibonachiGenerator fi = new FibonachiGeneratorForwardRecursive(10);
		//FibonachiGenerator fi = new FibonachiBackwardRecursive(10);		
		int[] a = fi.getFibonachi();
		
		System.out.println("Р§РёСЃР»Р° Р¤РёР±РѕРЅР°С‡Рё");
		
		for (int b : a) {
			System.out.println(b);
		}
	}
	
}
