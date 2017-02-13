package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */
// TODO declare that Coin implements Comparable<Coin>
public class Coin implements Comparable<Coin> {
	public static final String DEFAULT_CURRENCY = "Baht";
	/** Value of the coin. */
	private final double value;
	/** The currency, of course. */
	private final String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin(double value) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
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
		Coin other = (Coin) obj;
		if (this.value == other.value && this.currency == other.currency)
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
	 * @return -1 is the first coin is greater 
	 *          0 is there are the same 
	 *          -1 is the second is greater
	 */
	@Override
	public int compareTo(Coin other) {
		if (other == null)
			return -1;
		if (this.currency.equalsIgnoreCase(other.currency))
			return (int) Math.signum(this.value - other.value);

		return this.currency.compareTo(other.currency);
	}

	/**
	 * To describe result of a coin
	 */
	public String toString() {
		return this.value + " " + this.currency;

	}
}
