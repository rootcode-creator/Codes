package recursion;

public class subsecquence {

	public void subsecunce(String str,int index,String newString) {
		
		if(index==str.length()) {
			System.err.println(newString);
			return;
		}
		subsecunce(str,index+1,newString+str.charAt(index));
		subsecunce(str,index+1,newString);
	}
	public static void main(String[] args) {

		subsecquence obj=new subsecquence();
		String str="abc";
		obj.subsecunce(str, 0, "");
	}

}
