package com.epam.edu;

/**
 * Р“РµРЅРµСЂР°С†РёСЏ С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё
 * @author Denis
 * 
 */
abstract public class FibonachiGenerator {

	/**
	 * РЎРїРёСЃРѕРє С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё
	 */
	protected int[] fibonachi;

	public FibonachiGenerator(int n) {
		fibonachi = new int[n];
		fibonachi[0] = 1;
		fibonachi[1] = 1;

		populate(n);				
	}

	/**
	 * @return РІРѕР·РІСЂР°С‰Р°РµС‚ РєРѕРїРёСЋ СЃРїРёСЃРєР° С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё
	 */
	public int[] getFibonachi() {
		return fibonachi.clone();
	}
	
	/**
	 * @param n РґР»РёРЅРЅР° СЃРїРёСЃРєР° С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё
	 */
	abstract protected void populate(int n);
	
}
