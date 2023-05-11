package Map_Java;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Map_HashTableEx1 {

	public static void main(String[] args) {

		Hashtable<Integer,Object> hs=new Hashtable<>();
		hs.put(10,30);
		hs.put(80,90);
		hs.put(50,"Hi");
		hs.put(50,"Hello");//duplicates key are not allowed
//		hs.put(null, 50); not allowed
//		hs.put(50,null); not allowed
		hs.put(60,30);//duplicates values are not allowed
		hs.put(10,"Welcome");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.containsKey(50));
		System.out.println(hs.containsValue("welcome"));
		hs.remove(50);
		System.out.println(hs);
		for(Entry<Integer, Object> map:hs.entrySet())//  foreach loop to fetch objects 1 by 1 in map
		{
			System.out.println(map.getKey()+ " "+map.getValue());
		}
	}

}
