package coinpurse;

/**
 * A factory that create valuable of money both coin and banknote in thai and
 * malay currency
 * 
 * @author Worawat Chueajedton
 *
 */
public abstract class MoneyFactory {
	private static MoneyFactory instance = null;

	/**
	 * Constructor
	 */
	public MoneyFactory() {

	}

	/**
	 * To create or call MonetFactory.
	 * 
	 * @return MoneyFactory that ready to use
	 */
	public static MoneyFactory getInstance() {
		if (instance == null) {
			instance = new ThaiMoneyFactory();
		}
		return instance;
	}

	/**
	 * To create money with local currency.
	 * 
	 * @param value
	 *            value of money
	 * 
	 */
	public abstract Valuable createMoney(double value);

	/**
	 * To create money with local currency
	 * 
	 * @param value
	 *            value of money
	 * @return money that have created
	 */
	public Valuable createMoney(String value) {
		double realValaue = Double.parseDouble(value);
		return createMoney(realValaue);
	}
}
