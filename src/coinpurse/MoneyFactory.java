package coinpurse;

public abstract class MoneyFactory {
	private static MoneyFactory instance = null;

	public MoneyFactory() {

	}

	public static MoneyFactory getInstance() {
		if (instance == null) {
			instance = new ThaiMoneyFactory();
		}
		return instance;
	}

	public abstract Valuable createMoney(double value);

	public Valuable createMoney(String value) {
		double realValaue = Double.parseDouble(value);
		return createMoney(realValaue);
	}
}
