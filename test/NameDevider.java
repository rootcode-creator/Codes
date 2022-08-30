package test;

import java.util.Scanner;

public class NameDevider {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int i= s1.indexOf(';');
		System.out.println(i);
		String firstname=s1.substring(0, i);
		System.out.println(s1.indexOf('h'));
		String lastname=s1.substring(i+1);
		System.out.println(firstname);
		System.out.println(lastname);

	}

}
