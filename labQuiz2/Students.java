package labQuiz2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Students extends University implements User {

	@Override
	void fCreate() {
		// TODO Auto-generated method stub
		File f=new File("StudentInfo.txt");
	}

	@Override
	void fWrite(ArrayList<String> name, int[] marks) {
		
		
		try {
			
			FileWriter fr=new FileWriter("StudentInfo.txt");
			for(int count=0;count<name.size();count++) {
				fr.write(name.get(count)+" "+marks[count]+"\n");
				fr.close();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void fRead() {
		// TODO Auto-generated method stub
		
		ArrayList <String> lname=new ArrayList <String>();
		try {int count1=0;
			FileReader fr=new FileReader("StudentInfo.txt");
			Scanner sc=new Scanner(fr);
			int arr[]=new int[10];
			while(sc.hasNext()) {
				String name;
				int marks;
				name=sc.next();
				marks=Integer.valueOf(sc.next());
				
				lname.add(name);
				arr[count1]=marks;
				
				
				}
			int track, max=arr[0];
			
			for(int count=0;count<arr.length;count++) {
				if(max<arr[count]) {
					max=arr[count];
					track=count;
				}
				//FileWriter fr=new FileWriter("Highest.txt");
				//fr.write(name+" "+ );
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
