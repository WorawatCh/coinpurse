package coinpurse;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//TODO import ArrayList and Collections (so you can use Collections.sort())

/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full. When you withdraw money, the coin
 * purse decides which coins to remove.
 * 
 * @author your name
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
		for (int i =0;i<=money.size()-1;i++) {
			total += money.get(i).getValue();
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
		if (money.size() >= capacity) {
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
		} else {
			money.add(coin);
		}
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
		// TODO don't allow to withdraw amount < 0

		/*
		 * See lab sheet for outline of a solution, or devise your own solution.
		 */

		// Did we get the full amount?
		// This code assumes you decrease amount each time you remove a coin.
		if (amount > 0) { // failed. Don't change the contents of the purse.
			return null;
		}

		// Success.
		// Remove the coins you want to withdraw from purse,
		// and return them as an array.
		// Use list.toArray( array[] ) to copy a list into an array.
		// toArray returns a reference to the array itself.
		return new Coin[0]; // TODO replace this with real code
	}

	/**
	 * toString returns a string description of the purse contents. It can
	 * return whatever is a useful description.
	 */
	public String toString() {
		// TODO complete this
		return "you forgot to write Purse.toString()";
	}

	public static void main(String[] args) {
		Purse p1 = new Purse(3);
		p1.insert(new Coin(10));
		p1.insert(new Coin(0));
		p1.insert(new Coin(2));
		System.out.println(p1.getBalance());
	}
}
