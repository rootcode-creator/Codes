package classTask1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num,input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		input=sc.nextInt();
		num=input%2;
		
		switch(num){
			
			case 0:
				System.out.println(input+" "+"Is even number");
				break;
			default:
				System.out.println(input+" "+"Is odd number");
		}
		
	}

}
