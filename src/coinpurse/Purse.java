package coinpurse;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;

//TODO import ArrayList and Collections (so you can use Collections.sort())

/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full. When you withdraw money, the coin
 * purse decides which coins to remove.
 * 
 * @author Worawat Chueajedton
 */
public class Purse {
	/** Collection of objects in the purse. */
	// TODO declare a List of Coins named "money".

	/**
	 * Capacity is maximum number of coins the purse can hold. Capacity is set
	 * when the purse is created and cannot be changed.
	 */
	private final int capacity;
	List<Coin> money = new ArrayList<Coin>();
	private int total = 0;

	/**
	 * Create a purse with a specified capacity.
	 * 
	 * @param capacity
	 *            is maximum number of coins you can put in purse.
	 */
	public Purse(int capacity) {
		this.capacity = capacity;

	}

	/**
	 * Count and return the number of coins in the purse. This is the number of
	 * coins, not their value.
	 * 
	 * @return the number of coins in the purse
	 */
	public int count() {
		return money.size();
	}

	/**
	 * Get the total value of all items in the purse.
	 * 
	 * @return the total value of items in the purse.
	 */
	public double getBalance() {
		for (Coin coin : money) {
			total += coin.getValue();
		}
		return total;
	}

	/**
	 * Return the capacity of the coin purse.
	 * 
	 * @return the capacity
	 */
	// TODO write accessor method for capacity. Use Java naming convention.
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Test whether the purse is full. The purse is full if number of items in
	 * purse equals or greater than the purse capacity.
	 * 
	 * @return true if purse is full.
	 */
	public boolean isFull() {
		if (money.size() == capacity) {
			return true;
		}
		return false;
	}

	/**
	 * Insert a coin into the purse. The coin is only inserted if the purse has
	 * space for it and the coin has positive value. No worthless coins!
	 * 
	 * @param coin
	 *            is a Coin object to insert into purse
	 * @return true if coin inserted, false if can't insert
	 */
	public boolean insert(Coin coin) {
		if (coin.getValue() <= 0) {
			return false;
		} else if (money.size() == capacity) {
			return false;
		}
		money.add(coin);
		Collections.sort(money);
		return true;
	}

	/**
	 * Withdraw the requested amount of money. Return an array of Coins
	 * withdrawn from purse, or return null if cannot withdraw the amount
	 * requested.
	 * 
	 * @param amount
	 *            is the amount to withdraw
	 * @return array of Coin objects for money withdrawn, or null if cannot
	 *         withdraw requested amount.
	 */
	public Coin[] withdraw(double amount) {
		List<Coin> tempList = new ArrayList<Coin>();
		if (amount < 0) {
			return null;
		}
		for (int i = money.size() - 1; i >= 0; i--) {
			if (money.get(i).getValue() <= amount) {
				tempList.add(money.get(i));
				amount -= money.get(i).getValue();
				money.remove(i);
				i--;
			}
			if (amount > 0) {
				money.addAll(tempList);
				return null;
			}
		}

		Coin[] totalList = new Coin[money.size()];
		tempList.toArray(totalList);
		return totalList;
	} 

	/**
	 * toString returns a string description of the purse contents. It can
	 * return whatever is a useful description.
	 */
	public String toString() {
		return "This pusrse have "+money.size()+" coin and balance is "+this.getBalance();
	}

	public static void main(String[] args) {
		Purse purse = new Purse(3);
		purse.insert(new Coin(1));
		purse.insert(new Coin(10));
		purse.insert(new Coin(1000));
		purse.withdraw(10);
		System.out.println(purse.toString());
		
	}
}
