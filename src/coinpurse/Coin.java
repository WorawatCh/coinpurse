package coinpurse;

//TODO fix this Javadoc. It should be written as a COMPLETE SENTENCE WITH PERIOD.
/**
 * a coin with a monetary value and currency
 * 
 * @author
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

	// TODO Write a getValue() method and javadoc.
	public double getValue() {
		return this.value;
	}

	// TODO Write a getCurrency() method and javadoc.
	public String getCurrency() {
		return this.currency;
	}

	// TODO Write an equals(Object) method.
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

	// TODO Write a compareTo method and implement Comparable.
	@Override
	public int compareTo(Coin other) {
		if (other == null)
			return -1;
		if (this.currency.equalsIgnoreCase(other.currency))
			return (int) Math.signum(this.value - other.value);

		return this.currency.compareTo(other.currency);
	}

	// TODO write a toString() method. See labsheet for what to return.
	public String toString() {
		return this.value + " " + this.currency;

	}
}
