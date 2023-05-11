package Collection_Java;

import java.util.LinkedHashSet;

public class Collection_LinkedHashSetEx1 {

	public static void main(String[] args) {

		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("hello");
		set.add("hi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("hi"));
		System.out.println(set.remove(null));
		System.out.println(set);
	}

}
