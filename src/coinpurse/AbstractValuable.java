package coinpurse;

public class AbstractValuable implements Valuable, Comparable {
	private double value;
	private String currency;

	public AbstractValuable(double value) {
		this.value = value;
	}
	
	public AbstractValuable(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	/**
	 * To get a value of the coin.
	 * 
	 * @return value of the coin
	 */
	public double getValue() {
		return this.value;
	}

	/**
	 * To get a currency of the coin.
	 * 
	 * @return currency of coin
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * To test that 2 coin have same value and currency
	 * 
	 * @param obj
	 *            coin to test
	 * 
	 * @return true if there are the same false if there are not
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		AbstractValuable other = (AbstractValuable) obj;
		if (this.getValue() == other.getValue() && this.getCurrency() == other.getCurrency())
			return true;
		return false;
	}

	/**
	 * To compare 2 coin for test that which one is greater or less than another
	 * one.
	 * 
	 * @param other
	 *            coin to test
	 * 
	 * @return -1 is the first coin is greater 0 is there are the same -1 is the
	 *         second is greater
	 */
	public int compareTo(AbstractValuable other) {
		if (other == null)
			return -1;
		if (this.getCurrency().equalsIgnoreCase(other.getCurrency())) {
			if (this.getValue() > other.getValue()) {
				return 1;
			}
			if (this.getValue() < other.getValue()) {
				return -1;
			} else
				return 1;
		}
		return this.getCurrency().compareTo(other.getCurrency());
	}

}