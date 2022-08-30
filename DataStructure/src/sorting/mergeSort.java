package sorting;

public class mergeSort {
	//merge sort complexity is nlog n
	public static void conqure(int array[],int si,int mid,int ei) {
		
		//+1 because zero based index
		int merged[]=new int [ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			if(array[idx1]<=array[idx2]) {
				merged[x++]=array[idx1++];
			}else {
				merged[x++]=array[idx2++];
			}	
		}
		while(idx1<=mid) {
			merged[x++]=array[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=array[idx2++];
		}
		//experiment
		for(int i=0,j=si;i<merged.length;i++,j++) {
			array[j]=merged[i];
		}
	}
	
	public static void divide(int array[],int si,int ei) {
		//Base case
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		divide(array,si,mid);
		divide(array,mid+1,ei);
		conqure(array,si,mid,ei);
		
	}
	public static void main(String[] args) {
		
		int []array= {6,3,9,5,2,8};
		divide(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

}
