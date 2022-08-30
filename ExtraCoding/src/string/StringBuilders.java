package string;

public class StringBuilders {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Tony Stark");
//		System.out.println(sb);
//		System.out.println(sb.charAt(3));
//		sb.setCharAt(0, 'p');
//		System.out.println(sb);
//		sb.insert(0,'S' );
//		System.out.println(sb);
//		sb.delete(0, 4);
//		System.out.println(sb);
//		sb.append("ello");
//		System.out.println(sb);
//		System.out.println(sb.length());
//		
//		sb.reverse();
		for(int i=0;i<sb.length()/2;i++) {
			
			int back=sb.length()-i-1;
			char frontchar=sb.charAt(i);
			char backchar=sb.charAt(back);
			sb.setCharAt(i, backchar);
			sb.setCharAt(back, frontchar);
			
		}
		System.out.println(sb.length()/2);
		System.out.println(sb);
		
	}

}
