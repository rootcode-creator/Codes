package test;

public class converter {

	public static void main(String[] args) {
		String s = 2+"."+15;
		double d=Double.valueOf(s);
		System.out.println(d);
		String s2=""+d;
		String s3=s2.substring(2);
		System.out.println(Integer.valueOf(s3));

	}

}
