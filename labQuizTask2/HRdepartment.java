package labQuizTask2;
public class HRdepartment extends  ITdepartment{
	
	private String address;
	private String designation;
	
	public HRdepartment(String companyName, double location, int totalExperience, String empName, int age, int empId,
			double salary, String address, String designation) {
		super(companyName, location, totalExperience, empName, age, empId, salary);
		this.address = address;
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "HRdepartment [address=" + address + ", designation=" + designation + ", getEmpName()=" + getEmpName()
				+ ", getAge()=" + getAge() + ", getEmpId()=" + getEmpId() + ", getSalary()=" + getSalary()
				+ ", getCompanyName()=" + getCompanyName() + ", getLocation()=" + getLocation()
				+ ", getTotalExperience()=" + getTotalExperience() + "]";
	}
	
	public void minSalary(HRdepartment arr[],ITdepartment arr1[]) {
		int track=0;
		for(int count=0;count<arr.length;count++) {
			if(arr[count].getEmpName().matches(arr1[count].getEmpName())) {
				double minimum=arr[0].getSalary();
				if(minimum>arr[count].getSalary()) {
					minimum=arr[count].getSalary();
					track=count;
				}
			}
		}
		System.out.println(arr[track].toString());
	}
	
	
}
