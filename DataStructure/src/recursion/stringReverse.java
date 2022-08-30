package recursion;

public class stringReverse {
	public void strReverse(String str,int index) {
		if(index==0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.println(str.charAt(index));
		strReverse(str,index-1);
		
	}
	public static void main(String[] args) {
		
		stringReverse obj=new stringReverse();
		String str="ASDFG";
		obj.strReverse(str, str.length()-1);
	}

}
