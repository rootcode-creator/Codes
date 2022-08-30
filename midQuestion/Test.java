package midQuestion;

public class Test {

	private int x;
	public int getx(){
		return x;
	}
	Test(int a){
		x=a;
	}
	void func1(int x) {
		x=20;
	}
	void func1(Test t) {
		t.x=t.x+20;
	}
}
