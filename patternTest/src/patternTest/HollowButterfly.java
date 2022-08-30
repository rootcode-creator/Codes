package patternTest;

import java.util.Scanner;

public class HollowButterfly {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int space=2*n;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=i;j++) {
					
					if(j==1||i==j) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				space=space-2;
				for(int j=1;j<=space;j++) {
					
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++) {
					
					if(j==1||j==i) {
					System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			for(int i=n;i>=1;i--) {
				
				for(int j=1;j<=i;j++) {
					if(j==1||i==j) {
						System.out.print("*");
						}else {
							System.out.print(" ");
						}
				}
				
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++) {
					if(j==1||i==j) {
						System.out.print("*");
						}else {
							System.out.print(" ");
						}
				}
				space=space+2;
				System.out.println();
			}

		}

	}
