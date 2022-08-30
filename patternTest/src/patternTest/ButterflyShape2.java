package patternTest;

import java.util.Scanner;

public class ButterflyShape2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			int space=2*(n-i);
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=n;i>=1;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			int space=2*(n-i);
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
