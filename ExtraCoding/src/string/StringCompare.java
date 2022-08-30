package string;

public class StringCompare {

	public static void main(String[] args) {
		
		String str1="clear the road";
		String str2="clear";
		String str3=new String("null");
		String str4=null;
		String str5="null";
		//System.out.println(str4.equals(str3));//compare object value will case an exception cannot call .equal method by null object/string
		System.out.println(str1==str5);//comparing object with string pool string 
		
		if(str3==str4)//compare in string pool
			System.out.println("They are equal");
		else 
			System.out.println("Not Equal");
	}

}
