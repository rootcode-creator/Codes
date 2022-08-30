package labFinalTask3;

public class Salary {

	public void mySalary(int salary) throws InvalidSalaryException {
		if(salary<0) {
			throw new InvalidSalaryException("Invalid Salary");
		}
		else
			System.out.println("Valid salary");
	}
}
