package coinpurse;

/**
 * To create thai money by using MoneyFactory
 * 
 * @author Worawat Chueajedton
 *
 */
public class ThaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;

	/**
	 * To compare what they will create coin or banknote
	 * 
	 * @param value
	 *            A value of money to create
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value == 1 || value == 2 || value == 5 | value == 10) {
			return new Coin(value);
		}
		if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			return new BankNote(value, nextSerialNumber++);
		} else
			throw new IllegalArgumentException();
	}
}
