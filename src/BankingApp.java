
public class BankingApp {

	public static void main(String[] args) {
		
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		
		ac1.setData(111, "AAA", 10000);
		ac2.setData(112, "BBB", 20000);
		ac3.setData(113, "CCC", 30000);
		
		/*
		Account.showBalance(ac1);
		Account.showBalance(ac2);
		Account.showBalance(ac3);
		*/
		
		ac1.showBalance();
		ac2.showBalance();
		ac3.showBalance();
		
		/*
		ac1.showData();
		ac2.showData();
		ac3.showData();
		Account.showTotalBalance();
		*/
		
		//Account.showTotalBalance();
		//Account.showTotalBalance();
		
		
		//Account.info();
		
		/*
		ac1.showData();
		ac2.showData();
		ac3.showData();
		
		Account.showTotalBalance();
		*/
		
		
	}

}
