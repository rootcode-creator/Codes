package recursion;

public class nThFactorial {
	
	public void printFactorial(int i,int n,int fact) {
		if(i==n) {
			System.out.println("Factorial:"+(fact*=i));
			return;
		}
		fact*=i;
		printFactorial(i+1,n,fact);
	}
	
	public static void main(String[] args) {
		nThFactorial factorial=new nThFactorial();
		factorial.printFactorial(1, 6, 1);
	}

}
