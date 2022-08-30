package labQuizTask2;
public class ITdepartment extends Office {
	
	private String empName;
	private int age;
	private int empId;
	private double salary;
	
	
	public ITdepartment(String companyName, double location, int totalExperience, String empName, int age, int empId,
			double salary) {
		super(companyName, location, totalExperience);
		this.empName = empName;
		this.age = age;
		this.empId = empId;
		this.salary = salary;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "ITdepartment [empName=" + empName + ", age=" + age + ", empId=" + empId + ", salary=" + salary
				+ ", getEmpName()=" + getEmpName() + ", getAge()=" + getAge() + ", getEmpId()=" + getEmpId()
				+ ", getSalary()=" + getSalary() + "]";
	}


	public ITdepartment highestSalary(ITdepartment arr[]) {
		for(int count=0;count<arr.length;count++) {
			if(arr[count].age>25 && arr[count].age<39) {
				double maximum=arr[0].salary;
				if(arr[0].salary<arr[count].salary) {
					maximum=arr[count].salary;
				}
			}
		}
		ITdepartment temp=new ITdepartment(empName, salary, age, empName, age, age, salary);
		return temp ;
	}
	
}
