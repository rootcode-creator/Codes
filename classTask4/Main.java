package classTask4;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Task1andTask2 obj=new Task1andTask2();
		System.out.println("######## PROGRAM 1 #######");
		System.out.println("Enter a string:(small letter)");
		String str =sc.nextLine();
		
		System.out.println();
		
		int receive=obj.countVowels(str);
		System.out.println("Numbers of vowels in string is:"+receive+"\n");
		
		System.out.println("######## PROGRAM 2 #######");
		
		System.out.println("Enter a string:");
		String str2 =sc.nextLine();
		boolean p=obj.isPalidrome(str2);
		
		if(p)
			System.out.println(str2+" is a palindrom string");
		else
		System.out.println(str2+" is not a palindrom string");
		System.out.println();
		
		System.out.println();
		Task3 obj2=new Task3();
		String input;
		int value;
		int operation;
		double number;
		double balance = 0;
		System.out.println("######## PROGRAM 3 #######");
		do { 
			
			System.out.println("Press the number corresponding to opperation:\n1.DEPOSIT\n2.WITHDRAW\n3.BALANCE");
			 value=sc.nextInt();
			 if(value==3)
				 System.out.println("Your current balance is:"+balance+" Taka");
			 else
			 {
				 System.out.println("Enter the amount you want  to deposit or withdraw:");
				 number=sc.nextInt();
				 operation=value;
				 switch(operation){
				 case 1 :
					 balance=obj2.deosit(number, balance);
					 break;
				 case 2:
				 	  balance=obj2.withdraw(number, balance);
				 	  break;
				 
				 }
			 }
			 System.out.println("Do you want to continue YES or NO:");
			 input=sc.next();
			 
		}while(input.matches("YES"));
		
	}

	
}
