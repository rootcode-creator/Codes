package classTask2;
import java.util.Scanner;

public class UpperThanAvarage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int []a=new int[6];
		
		int sum = 0,count=0;
		double avg;
		for(int i = 0;i<a.length;i++) {
			System.out.print("Enter the value of array position "+i+":");
			a[i]=sc.nextInt();
			sum+=a[i];
			
			
		}
		avg=(double)sum/a.length;
		System.out.println("Averagege of user inputed value:"+avg);
		System.out.println("Length of array:"+a.length);
		for(int i=0;i<a.length;i++) {
			if(a[i]>avg) {
				count++;
			}
		}
		System.out.println("Value above average:"+count);
		System.out.println("Percentage:"+((double)(count*100)/a.length)+"%");
	}

}
