package midQuestion;

public class FuncionTest {

	public static void main(String[] args) {
		Test t1= new Test(10);
		t1.func1(t1.getx());
		System.out.println(t1.getx()+";");
		t1.func1(t1);
		System.out.println(t1.getx());

	}

}
