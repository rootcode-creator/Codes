package recursion;

public class moveAll {
	public static int count;
	public void moveX(String str,int index,String newString) {
		if(index==str.length()) {
			for(int i=0;i<count;i++)
				newString+='x';
			System.out.println(newString);
			return;
		}
		
		if(str.charAt(index)=='x') {
			count++;
			moveX(str,++index,newString);
		}
			
		else {
			newString+=str.charAt(index);
			moveX(str,++index,newString);
			
		}
		 
			
	}
	
	public static void main(String[] args) {
		
		moveAll obj=new moveAll();
		obj.moveX("axsdfghxxxj", 0, "");
		
	}

}
