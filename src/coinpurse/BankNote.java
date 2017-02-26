package coinpurse;

public class BankNote extends AbstractValuable {
	private long serialNumber;
	public static final String DEFAULT_CURRENCY = "Baht";

	public BankNote(double value, long currency) {
		super(value, DEFAULT_CURRENCY);
		this.serialNumber = currency;

	}

	public BankNote(double value, String currency, long serial) {
		super(value, currency);
		this.serialNumber = serial;

	}

	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * public boolean equals(Object obj) { if (obj == null) return false; if
	 * (obj.getClass() != this.getClass()) return false; BankNote other =
	 * (BankNote) obj; if (this.value == other.value &&
	 * this.currency.equalsIgnoreCase(other.currency)) { return true; } return
	 * false; }
	 **/

	public String toString() {
		return super.getValue() + "-" + super.getCurrency() + " note[" + this.getSerialNumber() + "]";
	}
}
