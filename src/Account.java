
public class Account {
	
	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;
	
	public void showBalance() {
		System.out.println("Balance in "+ano+" is "+balance);
	}
	/*
	public static void showBalance(Account tmp) {
		System.out.println("Balance in account "+tmp.ano+" is "+tmp.balance);
	}
	*/
	
	public static void showTotalBalance() {
		System.out.println("Total Balance  : "+totalBalance);
	}
					    
	public void showData() {
		System.out.println("Account Number : "+ano);
		System.out.println("Cust.   Name   : "+name);
		System.out.println("Balance   Rs.  : "+balance);
		System.out.println("_____________________________________________");
	}
	public void setData(int x, String y, int z) {
		ano=x;
		name=y;
		balance=z;
		totalBalance=totalBalance+z;
	}
}

