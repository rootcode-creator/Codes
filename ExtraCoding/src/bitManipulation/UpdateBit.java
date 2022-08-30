package bitManipulation;

import java.util.Scanner;

public class UpdateBit {

	public static void main(String[] args) {
		
		//Set Bit
		//Bit Mask:1<<i
		//Operation:OR (|)
		//Clear Bit
		//Bit Mask: 1<<i
		//Operation: AND with NOT(& ~)
		
		Scanner sc=new Scanner(System.in);
		int n= 5;
		int pos=1;
		System.out.print("Enter Operation:(Enter 0 or 1):");
		int operation=sc.nextInt();
		int bitMask=1<<pos;
		if(operation==1) {
			int number=(n|bitMask);
			System.out.println("Number:"+number);
		}else {
			int notBitMask=~(bitMask);
			int number=n & notBitMask;
			System.out.print("Number:"+number);
		}
		
		
	}

}
