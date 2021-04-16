
public class Account {
	
	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;
	
	public  void info() {
		System.out.println(balance);			//???
		System.out.println(totalBalance);		//60000
	}
	
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

