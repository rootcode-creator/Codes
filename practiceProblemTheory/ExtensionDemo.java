package practiceProblemTheory;
public class ExtensionDemo {

	public static void main(String[] args) {
		
		ExtendedShow ext=new ExtendedShow();
		SuperShow sup=ext;
		sup.show();
		ext.show();
		System.out.println("sup.str:"+sup.str);
		System.out.println("sub.str:"+ext.str);
		

	}

}
