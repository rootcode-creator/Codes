package linkList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkListByFrameworkCollection {

	public static void main(String[] args) {
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(2);
		System.out.println(list); 
		list.add(3);
		list.addLast(5);
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, 10);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"->");
		}
		System.out.println("null");
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		
		System.out.println(list);
		
		System.out.println(list);
		Object list2=list.clone();
		System.out.println(list2);
		
		System.out.println(list.element());
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
