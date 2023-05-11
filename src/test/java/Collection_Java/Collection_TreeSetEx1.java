package Collection_Java;

import java.util.TreeSet;

public class Collection_TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(50);
		ts.add(40);
		ts.add(10);
		ts.add(60);
		ts.add(10);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.first());//first object
		System.out.println(ts.last());//last object
		System.out.println(ts.higher(40));//after 40-50
		System.out.println(ts.lower(40));//before 40-10
		System.out.println(ts.headSet(50));//objects before 50(10,40)
		System.out.println(ts.tailSet(40));//objects after 40(40,50,60)
		System.out.println(ts.subSet(10, 60));//between 10 and 60
		System.out.println(ts.floor(20));//print lower object if 20 not present
		System.out.println(ts.ceiling(40));//print higher object if 40 not presnt 
	}

}
