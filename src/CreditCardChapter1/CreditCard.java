package CreditCardChapter1;

public class CreditCard {
	
	
	private String customer;	// name of the customer (e.g., ”John Bowman”)
	private String bank;		// name of the bank (e.g., ”California Savings”)
	private String account; 	//account identifier (e.g., ”5391 0375 9387 5309”)
	private int limit; 			// credit limit (measured in dollars)
	protected double balance;	// current balance (measured in dollars)
	
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		
		this.customer = cust;
		this.bank = bk;
		this.account = acnt;
		this.limit = lim;
		this.balance = initialBal;
	}
	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);
	}
	public void setCustomer(String cust)
	{
		this.customer = cust;
	}
	public void setBank(String bk)
	{
		this.bank = bk;
	}
	public void setAccount(String accnt)
	{
		this.account = accnt;
	}
	public void setLimit(int lim)
	{
		this.limit = lim;
	}
	public void setBalance(double bal)
	{
		this.balance = bal;
	}
	public String getCustomer( ) { return customer; }
	public String getBank( ) { return bank; }
	public String getAccount( ) { return account; }
	public int getLimit( ) { return limit; }
	public double getBalance( ) { return balance; }
	public boolean charge(double price) {
		if (price + balance > limit)
			return false;
		balance += price;
		return true;
	}
	public void makePayment(double amount) {
		balance -= amount;
	}
	public static void printSummary(CreditCard card) {
		System.out.println("Customer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance); // implicit cast
		System.out.println("Limit = " + card.limit);
	}
	
	public static void main(String[ ] args) {
		CreditCard[ ] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings",
				"5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bowman", "California Federal",
				"3485 0399 3395 1954", 3500);
		wallet[2] = new CreditCard("John Bowman", "California Finance",
				"5391 0375 9387 5309", 2500, 300);
		
		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for (CreditCard card : wallet) {
			CreditCard.printSummary(card);
			while(card.getBalance() > 200.0)
			{
				card.makePayment(200);
				System.out.println("New Balance = " + card.getBalance());
			}
		}
		PredatoryCreditCard[] walletP = new PredatoryCreditCard[3];
		
		walletP[0] = new PredatoryCreditCard("John Bowman", "California Savings",
				"5391 0375 9387 5309", 5000, 12000, 1);
		walletP[1] = new PredatoryCreditCard("Allan Carlo Ramos", "California Federal", 
				"4512 1486 0498 6410", 5000, 12000, 1);
		walletP[2] = new PredatoryCreditCard("Jaquie Andal", "California Super Savings", 
				"7319 6854 7181 9955", 5000, 12000, 1);
		
		walletP[0].charge(10000);
		walletP[1].charge(10020);
		walletP[2].charge(20121);
		
	}

}
