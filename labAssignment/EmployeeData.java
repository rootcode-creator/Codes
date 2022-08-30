package labAssignment;
import java.io.FileReader;
import java.util.Scanner;

public abstract class  EmployeeData {
	private String Name;
	private int Job_Id;
	private double Salary;
	private String Phone_Number;
	private String Address;
	private String Designation;
	
	public EmployeeData() {
		
	}
	public EmployeeData(int n) {
		int number_of_employee = n;
	}
	public EmployeeData(String name, int job_Id, double salary, String phone_Number, String address,
			String designation) {
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
	public void  Data(int n) throws Exception{
	
	FileReader fr= new FileReader("EmployeeInformation.txt");
	Scanner sc= new Scanner(fr);
	EmployeeData [] em= new EmployeeData[n];
	int count=0;
	
	
	while(sc.hasNext()) {
		em[count]= new LowestSalary();
		em[count].Name=sc.next();
		em[count].Job_Id=sc.nextInt();
		em[count].Salary=sc.nextDouble();
		em[count].Phone_Number=sc.next();
		em[count].Address=sc.next();
		em[count].Designation=sc.next();
		count++;
	}
	System.out.println("All Employee Information stored successfully");
	HighestSalary h = new HighestSalary();
	h.hSalary(em);
	LowestSalary d = new LowestSalary();
	d.lSalary(em);
	
	}
	
	public abstract void lSalary(EmployeeData[] lem) throws Exception;
	
	
	
	
	
	
	
	
}
