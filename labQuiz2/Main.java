package labQuiz2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <String> a= new ArrayList <String>();
		int [] marks=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int count=0;count<marks.length;count++) {
			String p=sc.next();
			a.add(p);
			marks[count]=sc.nextInt();
		
		Students s= new Students();
		s.fWrite(a, marks);
		s.fRead();
		
		

	}

}
}
