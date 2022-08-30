package recursion;

public class PrintSumOfNaturalNumber {
	
	public int naturalSum(int i,int n,int sum) {
		
		if(i==n) {
			sum+=i;
			return sum;
		}
		sum=naturalSum(i+1,n,sum);
		sum+=i;
		System.out.println("i"+i+"sum"+sum);
		if(i==1)
			System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		
		PrintSumOfNaturalNumber sum=new PrintSumOfNaturalNumber();
		sum.naturalSum(1,5,0);
	}

}
