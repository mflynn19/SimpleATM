public class BankAccount {
	
	private static long generatedAccountNumber = 100000001L;
	
	private long accountNumber;
	private double balance;
	private AccountHolder AccountHolder;
	
	/**
	 * Constructor for BankAccount class.
	 * 
	 * @param balance
	 * @param AccountHolder
	 */
	
	public BankAccount(double balance, AccountHolder AccountHolder) {
		this.accountNumber = BankAccount.generatedAccountNumber++;
		this.balance = balance;
		this.AccountHolder = AccountHolder;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the account number.
	 * 
	 * @return accountNumber
	 */
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Retrieves the balance.
	 * 
	 * @return balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Retrieves the AccountHolder.
	 * 
	 * @return AccountHolder
	 */
	
	public AccountHolder getAccountHolder() {
		return AccountHolder;
	}
	
	/**
	 * Sets the value of accountNumber.
	 * 
	 * @param accountNumber the new account number
	 */
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Sets the value of balance.
	 * 
	 * @param balance the new balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Sets the value of AccountHolder.
	 * 
	 * @param AccountHolder the new AccountHolder
	 */
	
	public void setAccountHolder(AccountHolder AccountHolder) {
		this.AccountHolder = AccountHolder;
	}
	
	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////
	
	/**
	 * Deposits money into this account.
	 * 
	 * @param amount the money to deposit
	 * @return a status code (0: invalid amount, 1: success)
	 */
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			return 1;
		}
	}
	
	/**
	 * Withdraws money from this account.
	 * 
	 * @param amount the money to withdraw
	 * @return a status code (0: insufficient funds, 1: invalid amount, 2: success)
	 */
	
	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;	
			return 2;
		}
	}
}