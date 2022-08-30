package bitManipulation;

import java.util.Scanner;

public class SetBit {

	public static void main(String[] args) {
		//Bit Mask:1<<i
		//Operation:OR (|)
		
		//int n=5;
		//int pos=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		System.out.print("Enter position:");
		int pos=sc.nextInt();
		
		int bitMask=1<<pos;
		int number=(n|bitMask);
		
		System.out.println("Number:"+number);
		
		

	}

}
