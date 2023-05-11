package Map_Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map_LinkedHashMapEx1 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Object> hs=new LinkedHashMap<>();
		hs.put(10,30);
		hs.put(80,90);
		hs.put(null,50);//not allowed
		hs.put(50,null);//not allowed
		hs.put(100,null);
		hs.put(50, "Hi");
		hs.put(50, "Hello");//duplicates keys are not allowed
		hs.put(60,30);//duplicates values are  allowed
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
