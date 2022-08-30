package classTask4;

public class Task3 {
		
	double deosit(double amount,double balance){
		
		balance+=amount;
		return balance;
	}
	
	double withdraw(double amount,double balance){
		
		balance-=amount;
		return balance;
	}
}
