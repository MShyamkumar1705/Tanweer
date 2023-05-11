package Collection_Java;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_LinkedLisrEx1 {

	public static void main(String[] args) {

		LinkedList<Object> list=new LinkedList<>();
		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		if(list.contains("hi")) {
			System.out.println("is present");
		}
		else {
			System.out.println("not present");
		}
		for(Object obj:list) {
			System.out.println(obj);
		}
		list.remove("hi");
		System.out.println(list);
		list.addFirst("Hakuna");
		System.out.println(list.indexOf(30));
		System.out.println(list.size());
		list.addLast("Hello");
		System.out.println(list);
		list.getLast();
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		Iterator<Object> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
