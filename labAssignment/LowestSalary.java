package labAssignment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LowestSalary extends EmployeeData{
	
	public LowestSalary() {
		super();
	}
	public LowestSalary(String name, int job_Id, double salary, String phone_Number, String address,
			String designation) {
		super(name, job_Id, salary, phone_Number, address, designation);
		
	}

	@Override
	public void lSalary(EmployeeData[] lem)throws Exception {
		double min=lem[0].getSalary();
		int track=0;
		for(int count=0;count<lem.length;count++) {
			if(min>lem[count].getSalary()) {
				min=lem[count].getSalary();
				track=count;
			}
		}
		
		
			File obj2= new File("lowest.txt");
			obj2.createNewFile();
			FileWriter fw= new FileWriter("lowest.txt");
			fw.write(lem[track].getName()+" "+String.valueOf(lem[track].getJob_Id())+" "+String.valueOf(lem[track].getSalary())+" "+
			lem[track].getPhone_Number()+" "+lem[track].getAddress()+" "+lem[track].getDesignation()+"\n");
			fw.close();
			System.out.println("Lowest Salary information stored successfully.");
		
	}

	
}
