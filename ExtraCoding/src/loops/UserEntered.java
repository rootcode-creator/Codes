package loops;

import java.util.Scanner;

public class UserEntered {

	public static void main(String[] args) {
		
		
		int zeroCount=0,positiveCount=0,negativeCount=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Want to continue?");
		String str=sc.next();
		while(!(str.matches("no"))) {
			
			System.out.println("Enter the number you want:");
			int number=sc.nextInt();
			if(number==0)
				zeroCount++;
			else if(number>0)
				positiveCount++;
			else if(number<0)
				negativeCount++;
			System.out.println("Want to continue?");
			str=sc.next();
			
		}
		
		System.out.println("Zero Entered:"+zeroCount);
		System.out.println("Positive Number Entered:"+positiveCount);
		System.out.println("Negative Number Entered:"+negativeCount);

	}
	
	
}
