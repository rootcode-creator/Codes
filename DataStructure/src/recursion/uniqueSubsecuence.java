package recursion;

import java.util.HashSet;

public class uniqueSubsecuence {

	public void uniqueSubsecunce(String str,int index,String newString,HashSet <String> set) {
		
		if(index==str.length()) {
			if(set.contains(newString))
				return;
			else {
				System.err.println(newString);
				set.add(newString);
				return;
			}
			
		}
		uniqueSubsecunce(str,index+1,newString+str.charAt(index),set);
		uniqueSubsecunce(str,index+1,newString, set);
	}
	public static void main(String[] args) {

		uniqueSubsecuence obj=new uniqueSubsecuence();
		String str="aaaaa";
		HashSet <String> set=new HashSet<String>();
		obj.uniqueSubsecunce(str, 0, "",set);
	}


}
