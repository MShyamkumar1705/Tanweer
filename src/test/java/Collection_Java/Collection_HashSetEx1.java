package Collection_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_HashSetEx1 {

	public static void main(String[] args) {

		HashSet<Object> hs=new HashSet<>();
		hs.add(10);
		hs.add("hi");
		hs.add(null);
		hs.add("hello");
		hs.add("hi");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("hi"));
		System.out.println(hs.isEmpty());
		
		ArrayList<Object> al=new ArrayList<>();
		al.add(7);
		al.add("byee");
		al.add(7);
		al.add(null);
		System.out.println(al.size());
		Iterator<Object>it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()) ;
		}
	}

}
