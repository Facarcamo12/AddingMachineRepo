package cse360assign2;

/**
 * This class has a main total variable where the total can be
 * altered by mathematical methods. Also, the history and total can be
 * printed.
 * 
 *@return int Returns the value of the total
 *@param int A value to add to the total
 *@param int A value to subtract from the total.
 */


public class AddingMachine {

	private int total;
	private String transactionHistory = "";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		transactionHistory += total;
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		transactionHistory += " + " + value;
		total += value;
	}
	
	public void subtract (int value) {
		transactionHistory += " - " + value;
		total -= value;
	}
		
	public String toString () {
		return transactionHistory;
	}

	public void clear() {
	
	}
}
