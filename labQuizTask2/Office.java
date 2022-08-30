package labQuizTask2;

public class Office {
	private String companyName; 
	private double location;
	private int totalExperience;
	
	
	public Office(String companyName, double location, int totalExperience) {
		
		this.companyName = companyName;
		this.location = location;
		this.totalExperience = totalExperience;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getLocation() {
		return location;
	}
	public void setLocation(double location) {
		this.location = location;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	@Override
	public String toString() {
		return "Office [companyName=" + companyName + ", location=" + location + ", totalExperience=" + totalExperience
				+ "]";
	}
	
	
}
