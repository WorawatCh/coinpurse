package coinpurse;

public class MalayMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;

	@Override
	public Valuable createMoney(double value) {
		if (value == 0.05 || value == 0.10 || value == 0.20 || value == 0.50) {
			return new Coin(value*100,"Sen");
		}
		if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100) {
			return new BankNote(value,"Ringgit" ,nextSerialNumber++);
		} else
			throw new IllegalArgumentException();
	}
	public static void main(String[] args) {
		MoneyFactory factory = MoneyFactory.getInstance();
		Valuable m = factory.createMoney( 5);
		 System.out.println(m.toString());
		 Valuable m2 = factory.createMoney("0.05");
		 System.out.println(m2.toString()); 
	}
}
