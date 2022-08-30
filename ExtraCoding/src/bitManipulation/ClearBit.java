package bitManipulation;

public class ClearBit {

	public static void main(String[] args) {
		//Bit Mask: 1<<i
		//Operation: AND with NOT(& ~)
		
		int n=5;
		int pos= 1;
		int bitMask=1<<pos;
		int notBitMask=~ (bitMask) ;
		int number= (n & notBitMask);
		System.out.println("Number:"+number);
		
	}

}
