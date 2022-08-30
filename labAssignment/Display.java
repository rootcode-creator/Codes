package labAssignment;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Display implements Salary {
	
	private String Name;
	private int Job_Id;
	private double Salary;
	private String Phone_Number;
	private String Address;
	private String Designation;
	private double Highest,Lowest;
	
	@Override
	public void allData(int n) throws Exception {
		FileReader fr= new FileReader("EmployeeInformation.txt");
		Scanner sc= new Scanner(fr);
		Display [] em= new Display[n];
		int count=0;
		
		
		while(sc.hasNext()) {
			em[count]= new Display();
			em[count].Name=sc.next();
			em[count].Job_Id=sc.nextInt();
			em[count].Salary=sc.nextDouble();
			em[count].Phone_Number=sc.next();
			em[count].Address=sc.next();
			em[count].Designation=sc.next();
			count++;
		}
		
		System.out.println("##### All Employee "+ " Information by Display Class #####");
		
		for(int tcount=0;tcount<em.length;tcount++) {
			
			System.out.println(em[tcount].Name+" "+em[tcount].Job_Id+" "+em[tcount].Salary+" "+em[tcount].Phone_Number+" "+em[tcount].Address+" "+em[tcount].Designation+"\n");
		}
		
	}

	@Override
	public void lowest() throws Exception {
		
		FileReader fr= new FileReader("lowest.txt");
		Scanner sc= new Scanner(fr);
		while(sc.hasNext()) {
			
			Name=sc.next();
			Job_Id=sc.nextInt();
			Salary=sc.nextDouble();
			Phone_Number=sc.next();
			Address=sc.next();
			Designation=sc.next();
			Lowest=Salary;
		}
		System.out.println("##### Lowest salary received employee #####");
		System.out.println("Name:"+Name+"\nJob Id:"+Job_Id+"\nSalary:"+Salary+"\nPhone No:"+Phone_Number+"\nAddress:"+Address+"\nDesignation:"+Designation+"\n");
	}

	@Override
	public void highest() throws Exception {
		
		FileReader fr= new FileReader("highest.txt");
		Scanner sc= new Scanner(fr);
		while(sc.hasNext()) {
			
			Name=sc.next();
			Job_Id=sc.nextInt();
			Salary=sc.nextDouble();
			Phone_Number=sc.next();
			Address=sc.next();
			Designation=sc.next();
			Highest=Salary;
		}
		System.out.println("##### Highest salary received employee #####");
		System.out.println("Name:"+Name+"\nJob Id:"+Job_Id+"\nSalary:"+Salary+"\nPhone No:"+Phone_Number+"\nAddress:"+Address+"\nDesignation:"+Designation+"\n");
	}

	@Override
	public void average() {
		
		double avarege=((Lowest+Highest)/2);
		System.out.println("##### Average #####");
		System.out.println(avarege);
	}

}
