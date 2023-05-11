package Collection_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList_EX1 {

	public static void main(String[] args) {

		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Shyam");
		al.add("Sidhart");
		al.add("Mir");
		al.add("sid");
		al.add("Shyam");
		al.add("Tanweer");
		al.add("Tanu");
		//Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(001);
		al1.add(002);
		al1.add(003);
		al1.add(007);
		al1.add(004);
		al1.add(007);
		al1.add(003);
		Collections.sort(al1);
		System.out.println(al1);
		al.add(al1);
		System.out.println(al);
		if(al.contains(al1)) {
			System.out.println("is present");
		}
		else {
			System.out.println("not present");
		}
		for(Object obj:al) {
			System.out.println(obj);
		}
		al.add(3,"Hello");
		al.remove(4);
		System.out.println(al.get(3));
		System.out.println(al.remove(new Integer(4)));
		al.add(4, "HAkuNa MetHaa...");
		System.out.println(al.get(4));
		System.out.println(al.size());
		
	}

}
