package labAssignment;
import java.io.File;
import java.io.FileWriter;

public class HighestSalary {
	
	
	public void  hSalary(EmployeeData [] emp) throws Exception {
		
		double max=emp[0].getSalary();
		int track=0;
		for(int count=0;count<emp.length;count++) {
			if(max<emp[count].getSalary()) {
				max=emp[count].getSalary();
				track=count;
			}
		}
		
		
		File obj= new File("highest.txt");
		obj.createNewFile();
		FileWriter fw= new FileWriter("highest.txt");
		fw.write(emp[track].getName()+" "+String.valueOf(emp[track].getJob_Id())+" "+String.valueOf(emp[track].getSalary())+" "+
		emp[track].getPhone_Number()+" "+emp[track].getAddress()+" "+emp[track].getDesignation()+"\n");
		fw.close();
		System.out.println("Highest Salary information stored successfully");
	}
}
