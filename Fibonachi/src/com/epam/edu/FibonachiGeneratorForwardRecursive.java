package com.epam.edu;

/**
 * Р“РµРЅРµСЂР°С†РёСЏ С‡РёСЃРµР» С„РёР±РѕРЅР°С‡Рё СЂРµРєСѓСЂСЃРёРµР№
 * @author Denis
 *
 */
public class FibonachiGeneratorForwardRecursive extends FibonachiGenerator {

	public FibonachiGeneratorForwardRecursive(int n) {
		super(n);
	}

	/**
	 * @see com.epam.edu.FibonachiGenerator#populate(int)
	 */
	@Override
	protected void populate(int n) {
		int i = fibonachi.length - n + 2;
		
		if (i == fibonachi.length) {
			return;
		}

		fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
		populate(--n);
	}

}
