package classTask6;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String name;
		int marks;
		double cgpa;
		
		Scanner sc=new Scanner(System.in);
		
		Students [] arr2=new Students[3];
	
		for(int count=0;count<arr2.length;count++) {
			System.out.println("Enter Student "+(count+1)+" Information:");
			name=sc.nextLine();
			marks=sc.nextInt();
			cgpa=sc.nextDouble();
			
			arr2[count]=new Students(name,marks,cgpa);
			sc.nextLine();
		}
		
		
		for(int count=0;count<arr2.length;count++) {
			
			System.out.println("Name:"+arr2[count].name+" "+"Marks:"+arr2[count].marks+" "+"Cgpa:"+arr2[count].cgpa);
		}
		
		Students obj=new Students();
		
		obj.evenSum(arr2);
		obj.oddSumAvgMarks(arr2);
		obj.minMarksInfo(arr2);
		obj.cgpaSumAvg(arr2);

	}

}
