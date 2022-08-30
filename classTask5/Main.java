package classTask5;

public class Main {

	public static void main(String[] args) {
		
		Students obj=new Students();
		String []name= {"A","B","C","D","E","F","G","H","I","J"};
		int []id= {10,20,30,40,50,60,70,80,90,100};
		double []cgpa= {3.4,2.3,3.5,3.9,4.0,2.4,3.6,3.7,3.2,3.1};
		double []marks= {70.5,74.5,88.3,100,88.0,65.0,90.0,90.0,88.5,95.0};
		obj.test(name, id, cgpa);
		
		//obj.test(name, marks);
		
		

	}

}
