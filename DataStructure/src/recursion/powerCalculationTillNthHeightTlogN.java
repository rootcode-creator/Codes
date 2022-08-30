package recursion;

public class powerCalculationTillNthHeightTlogN {
	
	public int logNCalculation(int x,int n) {
	
		if(x==0)
			return 0;
		if(n==0)
			return 1;
		
		if(n%2==0)
			return logNCalculation(x,n/2) * logNCalculation(x,n/2);
		else
			return logNCalculation(x,n/2) * logNCalculation(x,n/2)* x;
	}
	public static void main(String[] args) {
		
		powerCalculationTillNthHeightTlogN power=new powerCalculationTillNthHeightTlogN();
		int result=power.logNCalculation(2, 10);
		System.out.println("Result of power calculation:"+result);
		
	}

}
