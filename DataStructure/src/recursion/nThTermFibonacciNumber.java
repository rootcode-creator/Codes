package recursion;

import java.util.Scanner;

public class nThTermFibonacciNumber {
	
	public void printFibonacciNumber(int a,int b,int n) {
		if(n==0)
			return;
		int c=a+b;
		System.out.print(","+c);
		printFibonacciNumber(b,c,n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter terms:");
		int n=in.nextInt();
		int a=0,b=1;
		System.out.print(a+","+b);
		nThTermFibonacciNumber fibonacci=new nThTermFibonacciNumber();
		fibonacci.printFibonacciNumber(a, b, n-2);
	}

}
