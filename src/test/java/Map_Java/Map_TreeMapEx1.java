package Map_Java;

import java.util.TreeMap;

public class Map_TreeMapEx1 {

	public static void main(String[] args) {

		TreeMap<Character,Object> tm=new TreeMap<Character,Object>();
		tm.put('d', 50);
		tm.put('g',"hi");
		tm.put('z', 90);
		tm.put('b',"Hello");
		tm.put('m',1000);
		tm.put('c',"hi");
		//tm.put(null,50);
		tm.put('t',null);
		tm.put('x',null);
		System.out.println(tm);
	}

}
