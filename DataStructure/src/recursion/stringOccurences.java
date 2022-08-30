package recursion;

public class stringOccurences {
	
	public static  int first=-1;
	
	public static  int last=-1;
	
	public void sOccurances(String str,int index,char element) {
		
		if(index==str.length()) {
			System.out.println("First:"+first);
			System.out.println("Last:"+last);
			return;
		}
		
		if(str.charAt(index)==element) {
			if(first==-1)
				first=index;
			else
				last=index;
			
		}
		sOccurances(str,index+1,element);
	}
	
	public static void main(String[] args) {
		
		stringOccurences obj=new stringOccurences();
		String str="waaaaaaaaactcyytcytctytyya";
		//System.out.println(str.length());
		obj.sOccurances(str, 0, 'a');
	}
}
