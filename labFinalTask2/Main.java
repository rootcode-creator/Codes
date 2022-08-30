package labFinalTask2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int [][]marks= {{14,54,36,12,32},
				{58,58,55,45,11},
				{4,77,52,78,20},
				{44,77,55,44,21},
				{52,45,88,44,11}};
		String[] name=new String[3];
		String[] subjects=new String[3];
		Scanner sc=new Scanner(System.in);
		String subject1=sc.next();
		String subject2=sc.next();
		String subject3=sc.next();
		
		Subject s1=new Subject();
		s1.specificSubject(marks,subject1,subject2,subject3);
	}

}
