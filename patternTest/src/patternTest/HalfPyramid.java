package patternTest;

public class HalfPyramid {

		public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=0;j<n-i;j++) {
					System.out.print(" ");
				}
				int x=1;
				for(int j=1;j<=i;j++) {
					System.out.print(x+" ");
					x++;
				}
				System.out.println();
			}

		}

	}
