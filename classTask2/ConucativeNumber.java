package classTask2;
import java.util.Scanner;

public class ConucativeNumber {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int input=sc.nextInt();
		
		int []compare=new int[input+2];
		
		
		for(int i=0;i<input;i++) {
			System.out.println("Enter the array value"+i+":");
			compare[i]=sc.nextInt();
		}
		
		System.out.println("The numbers that are in consecutive orders of 3:");
		for(int i=0;i<input;i++) {
			
			if(compare[i]==compare[i+1]&&compare[i+1]==compare[i+2]) {
				
				System.out.println(compare[i]+" ");
			}
		}
	}

}
