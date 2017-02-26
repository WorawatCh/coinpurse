package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */
// TODO declare that Coin implements Comparable<Coin>
public class Coin extends AbstractValuable{
	public static final String DEFAULT_CURRENCY = "Baht";
	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 * @return 
	 */
	public Coin(double value){
		super(value,DEFAULT_CURRENCY);
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		super(value,currency);
	}

	/**
	 * To describe result of a coin
	 */
	public String toString() {
		return super.getValue() + "-" + super.getCurrency()+ " coin";

	}
}
