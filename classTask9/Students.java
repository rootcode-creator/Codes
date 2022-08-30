package classTask9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Students {
	
	private String name;
	private int marks;
	private double cgpa;
	
	public Students() {
		
	}
	public Students(String name, int marks, double cgpa) {
		super();
		this.name = name;
		this.marks = marks;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public void fcreate() throws Exception{
		File obj=new File("Data.txt");
		obj.createNewFile();
		File obj2=new File("max.txt");
		obj2.createNewFile();
		File obj3=new File("min.txt");
		obj3.createNewFile();
		File obj4=new File("sum.txt");
		obj4.createNewFile();
		File obj5=new File("avg.txt");
		obj5.createNewFile();
		 
	}
	
	public void fwrite(Students[]arr) throws Exception{
		FileWriter fr=new FileWriter("Data.txt");
		for(int count=0;count<arr.length;count++) {
			fr.write(arr[count].name+" "+String.valueOf(arr[count].marks)+" "+String.valueOf(arr[count].cgpa)+"\n");
		}
		fr.close();
		
	}
	
	public void fread() throws Exception{
		FileReader fr=new FileReader("Data.txt");
		Scanner sc=new Scanner(fr);
		Students [] arr =new Students[10];
		int count=0;
		while(sc.hasNext()) {
			arr[count]=new Students();
			arr[count].name=sc.next();
			arr[count].marks=sc.nextInt();
			arr[count].cgpa=sc.nextDouble();
			count++;
		}
		
		for(int count2=0;count2<arr.length;count2++) {
			System.out.println(arr[count2].name+" "+arr[count2].marks+" "+arr[count2].cgpa);
		}
		
		double max=arr[0].marks;
		int maxtrack=0;
		for(int count3=0;count3<arr.length;count3++) {
			if(max<arr[count3].marks) {
				max=arr[count3].marks;
				maxtrack=count3;
			}
		}
		
		FileWriter fb=new FileWriter("max.txt");
		fb.write(arr[maxtrack].name+" "+String.valueOf(arr[maxtrack].marks)+" "+String.valueOf(arr[maxtrack].cgpa)+"\n");
		fb.close();
		int mintrack=0;
		double min=arr[0].marks;
		for(int count4=0;count4<arr.length;count4++) {
			if(min>arr[count4].marks) {
				min=arr[count4].marks;
				mintrack=count4;
			}
		}
		
		FileWriter fs=new FileWriter("min.txt");
		fs.write(arr[mintrack].name+" "+String.valueOf(arr[mintrack].marks)+" "+String.valueOf(arr[mintrack].cgpa)+"\n");
		fs.close();
		int sum=0;
		for(int scount=0;scount<arr.length;scount++) {
			sum+=arr[scount].marks;
		}
		
		double avarage=(double) sum/arr.length;
		FileWriter fn=new FileWriter("sum.txt");
		fn.write(String.valueOf(sum));
		fn.close();
		FileWriter fo=new FileWriter("avg.txt");
		fo.write(String.valueOf(avarage));
		fo.close();
		
		
	}
	
	
}
