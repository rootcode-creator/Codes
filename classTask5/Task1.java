package classTask5;

public class Task1 {
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.integerchar(15, 'A');
		obj.integerchar('B', 25);
	}
	
	 void integerchar(int n,char c) {
			
			System.out.println("Integer:"+n);
			System.out.println("Character:"+c);
	}
	 void integerchar(char c, int n) {
			
			System.out.println("Character2:"+c);
			System.out.println("Integer2:"+n);
	}
	 

}
