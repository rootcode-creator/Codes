package recursion;

public class removeDuplicateInString {
	
	public boolean map[]=new boolean[26];
	
	public void removeDuplicate(String str,int index,String newString) {
		if(index==str.length()) {
			System.out.println("Unduplicated String:"+newString);
			return;
		}
		char current=str.charAt(index);
		if(map[current-'a'])
			removeDuplicate(str,index+1,newString);
		else {
			newString+=str.charAt(index);
			map[str.charAt(index)-'a']=true;
			removeDuplicate(str,index+1,newString);
		}
	}
	
	
	public static void main(String[] args) {
		
		 removeDuplicateInString obj=new  removeDuplicateInString();
		 obj.removeDuplicate("aaaxxxpppjddd", 0, "");
	}

}
