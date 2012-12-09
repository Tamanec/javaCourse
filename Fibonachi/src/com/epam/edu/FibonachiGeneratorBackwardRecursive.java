package com.epam.edu;

/**
 * Р“РµРЅРµСЂР°С†РёСЏ С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё РѕР±СЂР°С‚РЅРѕР№ СЂРµРєСѓСЂСЃРёРµР№
 * @author Denis
 *
 */
public class FibonachiGeneratorBackwardRecursive extends FibonachiGenerator {

	public FibonachiGeneratorBackwardRecursive(int n) {
		super(n);
	}

	/**
	 * @see com.epam.edu.FibonachiGenerator#populate(int)
	 */
	@Override
	protected void populate(int n) {
		backwardRecursive(n);
	}
	
	/**
	 * @param n РґР»РёРЅРЅР° СЃРїРёСЃРєР° С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё
	 * @return
	 */
	private int backwardRecursive(int n) {
		if (n == 2) {
			return fibonachi[n] = fibonachi[n - 1] + fibonachi[n - 2];
		}		

		if (n == fibonachi.length) {
			return fibonachi[--n] = backwardRecursive(n - 1) + fibonachi[n - 2];
		} else {
			return fibonachi[n] = backwardRecursive(n - 1) + fibonachi[n - 2];
		}
	}

}
