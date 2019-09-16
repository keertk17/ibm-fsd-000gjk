package IBM_1408;

import java.io.Serializable;

public class Account implements Serializable {//only interface in java which does not have any abstract method
	
	private int accountNumber;
	private int amount;
 
	public Account() {
		
	}
	
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	
	public Account createNewAccount(int accountNumber,int amount)throws AccountNotValidException{
		this.accountNumber=accountNumber;
		this.amount=amount;
		if(amount<1000) {
			throw new AccountNotValidException("Not a valid amount");
		}
		return new Account(accountNumber,amount);
	}
}
