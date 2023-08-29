package Bismillah;
 class InsufficientFundExpection extends Exception {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
} 
class Account{
	double balance=1000;
	public  void  widthdraw(int width) { 
		try {
			if(balance>width) { 
				balance-=width;
			System.out.println("Your Remaining Balance Is "+balance);
			}
		else
			throw new InsufficientFundExpection(); 
		}
		catch(InsufficientFundExpection i) {
			System.err.println("Not Enough Money");
		}
	}
	
	public void addBalance(int b){
		balance = b+balance;   
	}
	public void displayBalance() {
		System.out.println("Your Balance Is "+balance );
	}
}
public class expectionHandling {
	public static void main(String args[]) {
		 Account a = new Account();
		 a.widthdraw(500);
		 a.widthdraw(1000);
		 a.widthdraw(147);
		 a.addBalance(10000);
		 a.displayBalance();
		a.addBalance(1000);
		 a.displayBalance();
		 a.widthdraw(10000);
		 a.displayBalance();
		 
	}

}
