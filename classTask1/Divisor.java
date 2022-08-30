package classTask1;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		
		int input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		input=sc.nextInt();
		
		System.out.println("The divisors of "+input+" are:");
		for(int i=1;i<input;i++) {
			
			if(input%i==0) {
				
				System.out.println(i);
			}
		}

	}

}
