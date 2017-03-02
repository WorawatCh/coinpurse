package coinpurse;

/**
 * Banknote represents money with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */

public class BankNote extends AbstractValuable {
	private long serialNumber;
	public static final String DEFAULT_CURRENCY = "Baht";

	/**
	 * A banknote with value and serialnumber and use default currency.
	 * 
	 * @param value
	 *            A value of banknote
	 * @param serial
	 *            A serialnumber of banknote
	 */
	public BankNote(double value, long serial) {
		super(value, DEFAULT_CURRENCY);
		this.serialNumber = serial;

	}

	/**
	 * A banknote with value, serialnumber and currency.
	 * 
	 * @param value
	 *            A value of banknote
	 * @param currency
	 *            A currency of banknote
	 * @param serial
	 *            A serialnumber of banknote
	 */
	public BankNote(double value, String currency, long serial) {
		super(value, currency);
		this.serialNumber = serial;

	}

	/**
	 * To return serialnumber of banknote
	 * 
	 * @return serialnumber of banknote
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * To show what in this banknote value,currency,serialnumber or three of
	 * them
	 */
	public String toString() {
		return super.getValue() + "-" + super.getCurrency() + " note[" + this.getSerialNumber() + "]";
	}
}
