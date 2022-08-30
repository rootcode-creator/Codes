package classTask1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		input=sc.nextInt();
		
		for(int i=2;i<input;i++) {
			
			if(input%i==0) {
				
				flag=1;
				break;
			}
			
		}
		
			if(flag==0)
				System.out.println(input+" "+"Is a prime number");
			
			else
				System.out.println(input+" "+"Is not a prime number");
		
			
	}

}
