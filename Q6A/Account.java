//Account
import java.util.*;

class Account {
  private double balance=0.0;
  private AccountHolder holder;
  
  public Account(double balance, AccountHolder holder) {
		this.balance = balance;
		this.holder = holder;
	}

  public void deposit(double amt) {
   balance += amt;
  }

  public void withdraw(double amt){
    balance -= amt;
  }
  public double getBalance() {
    return balance;
  }
}