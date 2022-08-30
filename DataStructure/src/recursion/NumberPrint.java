package recursion;

public class NumberPrint {
	
	public void NumberPrint(int x) {
		if(x==0)
			return;
		System.out.println(x);
		NumberPrint(x-1);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		NumberPrint p= new NumberPrint();
		p.NumberPrint(5);
	}

}
