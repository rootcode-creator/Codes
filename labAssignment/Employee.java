package labAssignment;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee {

	private String Name;
	private int Job_Id;
	private double Salary;
	private String Phone_Number;
	private String Address;
	private String Designation;
	public Employee() {
		
	}
	public Employee(String name, int job_Id, double salary, String phone_Number, String address, String designation) {
		Name = name;
		Job_Id = job_Id;
		Salary = salary;
		Phone_Number = phone_Number;
		Address = address;
		Designation = designation;
	}
	
	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getJob_Id() {
		return Job_Id;
	}



	public void setJob_Id(int job_Id) {
		Job_Id = job_Id;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}



	public String getPhone_Number() {
		return Phone_Number;
	}



	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getDesignation() {
		return Designation;
	}



	public void setDesignation(String designation) {
		Designation = designation;
	}



	public void  information (int n) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		Employee [] em=new Employee[n];
		
		label:for(int icount=0;icount<em.length;icount++) {
			System.out.println("Enter "+(icount+1)+" employee details?");
			em[icount]= new Employee();
			System.out.println("Name:");
			
			//Name,Job_Id, Salary, Phone_Number, Address, Designation
			em[icount].Name=sc.next();
			System.out.println("Id:");
			em[icount].Job_Id=sc.nextInt();
			System.out.println("Salary>0:");
			em[icount].Salary=sc.nextDouble();
			if(em[icount].Salary<0) {
			System.out.println("Invalid Salary");
			break label;
			}
			else {
			
			System.out.println("Phone Number:");
			em[icount].Phone_Number=sc.next();
			System.out.println("Address:");
			em[icount].Address=sc.next();
			System.out.println("Designation:");
			em[icount].Designation=sc.next();
			}
			
		}
		File obj= new File("EmployeeInformation.txt");
		obj.createNewFile();
		FileWriter fw= new FileWriter("EmployeeInformation.txt");
		for(int wcount=0; wcount<em.length;wcount++) {
			fw.write(em[wcount].Name+" "+String.valueOf(em[wcount].Job_Id)+" "+
			String.valueOf(em[wcount].Salary)+" "+em[wcount].Phone_Number+" "+
			em[wcount].Address+" "+em[wcount].Designation+"\n");
		}
		fw.close();
		
		
		
		
		
	}
}
