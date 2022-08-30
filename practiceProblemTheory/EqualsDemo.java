package practiceProblemTheory;
public class EqualsDemo {

	public static void main(String[] args) {
		
		First e1=new First();
		First e2=new First();
		First e4=new First();

		e1.i=10;e2.i=20;e4.i=10;
		First e3=e2;
		Second e6=new Second();
		Second e7=new Second();
		e6.i=30;e7.i=30;
		Third e8=new Third();
		Third e9=new Third();
		e8.i=12;e9.i=12;
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e6.equals(e7));
		System.out.println(e8.equals(e9));
	}

}
