package classTask3;
import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		
		int [][]nums=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int rowsum=0,colsum=0,leftdiagonalsum=0,rightdiagonalsum=0;
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=0;j<nums[i].length;j++) {
				System.out.println("Enter the value of matrix position "+"["+i+","+j+"]"+":");
				nums[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("The matrix you entered :");
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=0;j<nums[i].length;j++) {
				
				rowsum+=nums[i][j];
				
				
			}
			System.out.println("The row sum of row "+(i+1)+":"+rowsum );
			rowsum=0;
			System.out.println();
		}
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=0;j<nums[i].length;j++) {
				colsum+=nums[j][i];
				
				
			}
			System.out.println("The column sum of column "+(i+1)+":"+colsum );
			colsum=0;
			System.out.println();
		}
		
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=0;j<nums[i].length;j++) {
				
				if(i==j)
					leftdiagonalsum+=nums[i][j];
				
				if(i+j==nums.length-1)
					rightdiagonalsum+=nums[i][j];
			}
			
		}
		
		System.out.println("Left diagonal sum of the matrix:"+leftdiagonalsum);
		System.out.println("Right diagonal sum of the matrix:"+rightdiagonalsum);
		
		

	}

}
