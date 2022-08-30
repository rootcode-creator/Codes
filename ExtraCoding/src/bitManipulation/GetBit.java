package bitManipulation;

import java.util.Scanner;

public class GetBit {

	public static void main(String[] args) {
		
		//Bit Mask: 1<i
		//Operation:AND (&)
		
		//int n=5;//0101
		//int pos=3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		System.out.print("Enter position:");
		int pos=sc.nextInt();
		
		int bitMask=1<<pos;
		//System.out.println(bitMask);//output 4 (0100)
		
		if((n & bitMask)==0)
			System.out.println("Bit was zero");
		
		
		else
			System.out.println("Bit was one");
		
	}

}
