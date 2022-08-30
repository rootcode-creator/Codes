package recursion;

public class striclySorted {
	
	public boolean sSorted(int[] arr,int index) {
		if(index==arr.length-1)
			return true;
		
		if(arr[index]<arr[index+1]){
			 return sSorted(arr,index+1);
		}
			
		return false;
	}
	public static void main(String[] args) {
		striclySorted obj=new striclySorted();
		int []arr= {1,3,3,4,5,6,7};
		System.out.println(obj.sSorted(arr, 0));
	}

}
