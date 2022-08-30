package recursion;

public class powerCalculationTillNthHeight {
//	
//	public int powerCalculation(int x,int n) {
//		
//		if(x==0)
//			return 0;
//		if(n==0)
//			return 1;
//		
//		int powerReturn=powerCalculation(x,n-1);
//		int result= x*powerReturn;
//		return result; //time complexity will be n
//	}
	public void powerCalculation(int x,int n,int result) {
		
		if(n==0) {
			System.out.println(1);
			return;
		}
		int temp=x;
		result*=temp;
		powerCalculation(x,n-1,result);
		if(n==1)
			System.out.println(result);
		
	}
	public static void main(String[] args) {
		
		powerCalculationTillNthHeight power=new powerCalculationTillNthHeight();
		//System.out.println(power.powerCalculation(2, 6));
		int n=5;
		if(n==0) {
			System.out.println(1);
		}
		else
		power.powerCalculation(2, n,1);
	}

}
