package linkList;

import java.util.Arrays;
import java.util.Collections;

public class arrayRev {

	public static void main(String[] args) {
		Integer []array= {1,2,3,7,5,9,7,8};
		Collections.reverse(Arrays.asList(array));
		for(int i:array)
		System.out.println(i);
		

	}

}
