package classTask9;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String name;
		int marks;
		double cgpa;
		Scanner sc=new Scanner(System.in);
		
		
		Students [] arr =new Students[10];
		Students obj=new Students();
		for(int count=0;count<arr.length;count++) {
			System.out.println("Enter student "+(count+1)+" Information:");
			name=sc.next();
			marks=sc.nextInt();
			cgpa=sc.nextDouble();
			arr[count]=new Students(name,marks,cgpa);
		}
		obj.fcreate();
		obj.fwrite(arr);
		obj.fread();

	}

}
