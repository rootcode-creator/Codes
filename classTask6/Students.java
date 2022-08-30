package classTask6;

public class Students {
	
	public String name;
	public int marks;
	public double cgpa;
	
	public Students() {
		this.name = null;
		this.marks = 0;
		this.cgpa = 0;
	}
	public Students(String name, int marks, double cgpa) {
		
		this.name = name;
		this.marks = marks;
		this.cgpa = cgpa;
	}
	
	public void evenSum(Students[] arr) {
		int track=0;
		int max=arr[0].marks;
		for(int count=0;count<arr.length;count++) {
			if(max<arr[count].marks) {
				
				max=arr[count].marks;
				track=count;
			}
	
		}
		
		System.out.println("Maximum:");
		System.out.println(arr[track].name+" "+arr[track].marks+" "+arr[track].cgpa);
		
		
	}
	
	public void oddSumAvgMarks(Students[] arr) {
		int sum=0,track=0;
		for(int count=0;count<arr.length;count++) {
			if(arr[count].marks%2!=0) {
				sum+=arr[count].marks;
				track++;
			}
		}
		System.out.println("Odd Sum:"+sum);
		System.out.println("Odd Sum Average:");
		System.out.println((double)sum/track);
	}
	
	public void minMarksInfo(Students[] arr) {
		int track=0;
		int min=arr[0].marks;
		for(int count=0;count<arr.length;count++) {
			if(min>arr[count].marks) {
				min=arr[count].marks;
				track=count;
			}
		}
		
		System.out.println("Minimum:");
		System.out.println(arr[track].name+" "+arr[track].marks+" "+arr[track].cgpa);
		
		
	}
	
	public void cgpaSumAvg(Students[] arr) {
		
		double sum=0;
		for(int count=0;count<arr.length;count++) {
			sum+=arr[count].cgpa;
		}
		System.out.println("Cgpa Sum:"+sum);
		System.out.println("Cgpa Avarage:");
		System.out.println(sum/arr.length);
		
		
	}
	
	
	
	
	
}
