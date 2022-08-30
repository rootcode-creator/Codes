package labAssignment;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Employee Information?");
		int n =sc.nextInt();
		
		Employee e = new Employee();
		e.information(n);
		LowestSalary d = new LowestSalary();
		d.Data(n);
		Display p =new Display();
		p.highest();
		p.lowest();
		p.average();
		p.allData(n);
		
	}

}
