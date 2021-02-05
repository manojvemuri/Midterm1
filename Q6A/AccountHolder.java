import java.util.HashSet;
import java.util.Set;

class AccountHolder {

	protected int ID;
	protected String address;
	protected SetAccount accounts;

	public AccountHolder(int ID, String address) {
		this.ID = ID;
		this.address = address;
		accounts = new HashSet<Account>();
	}

	public int getID() {
     return ID; 
  }
	public String getAddress() {
     return address; 
  }

	public void setID(int id) {
		this.ID = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// delegators for accounts
	public void add(Account account) {
		accounts.add(account);
	}

	public static int nextID() {
		return 0; // for now
	}


}
