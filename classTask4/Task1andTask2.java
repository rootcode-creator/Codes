package classTask4;

public class Task1andTask2 {

	int countVowels(String arg) {
		String str=arg;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	boolean isPalidrome(String arg) {
		
		String str =arg;
		
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
			/* System.out.println(reverse); */
		}
			
			
		  for(int i=0;i<str.length();i++) { 
			  
			  if(str.charAt(i)!=reverse.charAt(i)) {
				  
				  
				  return false;
			  }
			  
		   }
		  
		  	return true;
		 
		
		/*
		 * if(str.equals(reverse)) return true; else return false;
		 */
	}
}
