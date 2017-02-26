package coinpurse;

import java.util.Comparator;

/**
 * CompareByCurrency is a class that to compare 2 coins.
 * 
 * @author Worawat Chueajedton
 *
 */

public class CompareByCurrency implements Comparator<Valuable> {
	/**
	 * This method will compare 2 coin if return-1 currency of c1 come first
	 * return 0 if three are same currency and if return 1 currency of c2 come
	 * first
	 * 
	 * @param c1
	 *            first coin
	 * @param c2
	 *            second coin
	 * 
	 * @return return -1 if currency of c1 come first 
	 *         return 0 if three are same currency 
	 *         return 1 if currency of c2 come first
	 * 
	 * 
	 * 
	 */

	@Override
	public int compare(Valuable c1, Valuable c2) {
		return c1.getCurrency().compareToIgnoreCase(c2.getCurrency());
	}

}
