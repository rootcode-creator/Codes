package recursion;

public class towerOfHanoi {
	public void tHanoi(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println("transfer disk "+n+" from "+src+" to "+dest+" and helper is "+helper);
			return;
		}
		tHanoi(n-1,src,dest,helper);
		System.out.println("transfer disk "+n+" from "+src+" to "+dest+" and helper is "+helper);
		tHanoi(n-1,helper,src,dest);
	}
	public static void main(String[] args) {
		
		towerOfHanoi th=new towerOfHanoi();
		int n=3;
		th.tHanoi(n, "S", "H", "D");
		
	}

}
