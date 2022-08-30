package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(0);
		list1.add(4);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		System.out.println(list);
		System.out.println(list1);
		
		
		System.out.println(list.get(1));
		
		//list.add(0, 1);
		//System.out.println(list);
		//list.clear();
		//System.out.println(list);
		System.out.println(list.indexOf(3));
		System.out.println(list.lastIndexOf(3));
		System.out.println(list.contains(6));
		System.out.println(list.equals(list1));
		list.removeAll(list1);
		System.out.println("list1"+list1);
		System.out.println(list);
		Object list3=list1.clone();
		System.out.println(list3);
		System.out.println(list1.hashCode());
		list1.ensureCapacity(50);
		System.out.println(list1.hashCode());
		list1.remove(list3);
		System.out.println(list1);
		System.out.println(list1);
		Iterator<Integer>list5=list1.listIterator();
		while(list5.hasNext()) {
			System.out.print(list5.next());
		}
		System.out.println();
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(0);
		array.add(5);
		array.addAll(list1);
		System.out.println(array);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
