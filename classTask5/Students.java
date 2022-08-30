package classTask5;

public class Students {
	
	void test(String name[],int id[],double cgpa[]) {
		double sum=0;
		for(int i=0;i<name.length;i++) {
			System.out.println("Student "+(i+1)+ " information:");
			System.out.println("Name:"+name[i]);
			System.out.println("Id:"+id[i]);
			System.out.println("Cgpa:"+cgpa[i]);
			sum+=cgpa[i];
		}
		
		
		double average=sum/cgpa.length;
		
		System.out.println("Sum of cgpa:"+sum);
		System.out.println("Average:"+average);
	}
	
	void test(String name[],double marks[]) {
		int track = 0;
		double best=marks[0];
		for(int i=0;i<name.length;i++) {
			
			if(marks[i]>best) {
				best=marks[i];
				track=i;
			}
		}
		System.out.println("Best  scorer’s name:"+name[track]);
		System.out.println("Best  scorer’s Id:"+marks[track]);
		
	}
}
