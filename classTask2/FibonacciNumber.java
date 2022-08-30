package classTask2;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		int number_of_fibonacci_number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nuber of fibonacci nuber you want generate:");
		number_of_fibonacci_number=sc.nextInt();
		int []fibonacci=new int[number_of_fibonacci_number];
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for(int i=2;i<fibonacci.length;i++) {
			
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		
		System.out.println("Generated fibonacci number:");
		for(int x:fibonacci) {
			
			System.out.print(" "+x);
			
		}

	}

}
