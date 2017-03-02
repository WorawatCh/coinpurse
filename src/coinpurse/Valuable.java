package coinpurse;

/**
 * An interface for objects having a monetary value and currency
 * 
 * @author Worawat Chueajedton
 *
 */
public interface Valuable extends Comparable {
	/**
	 * To get value of the object.
	 * 
	 * @return a value of this object
	 */
	public double getValue();

	/**
	 * To get currency of the object.
	 * 
	 * @return a currency of this object
	 */
	public String getCurrency();

}
