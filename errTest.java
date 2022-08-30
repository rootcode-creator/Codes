import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class errTest {

	public static void main(String[] args) throws Exception {
		
		File x=new File("S.txt");
		FileWriter fr=new FileWriter(x);
		fr.write("Hello World");
		fr.close();
		FileReader fs=new FileReader("S.txt");
		Scanner sc=new Scanner(fs);
		while(sc.hasNextLine()) {
			String p=sc.nextLine();
			System.err.println(p);
		}
	}

}
