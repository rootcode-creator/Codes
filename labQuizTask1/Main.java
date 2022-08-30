package labQuizTask1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int L;
		int N;
		int W,H;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Length");
		L=input.nextInt();
		System.out.println("Enter Total photos");
		N=input.nextInt();
		UploadPhoto U=new UploadPhoto();
		for(int count=0;count<N;count++) {
			System.out.println("Enter Height and width of the photo");
			W=input.nextInt();
			H=input.nextInt();
			U.upload(H, W, L);
		}

	}

}
