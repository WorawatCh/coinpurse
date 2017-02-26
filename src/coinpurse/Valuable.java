package coinpurse;
/**
 * An interface for objects having a monetary value and currency
 * @author User
 *
 */
public interface Valuable extends Comparable {
	public double getValue();

	public String getCurrency();



}
