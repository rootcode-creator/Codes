package classTask1;

public class MultipicationTable {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Multipication table of "+i+" are:");
			for(int j=1;j<=10;j++) {
				
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	}

}
