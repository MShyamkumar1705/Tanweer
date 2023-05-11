package TyssAssignmenet;

import java.util.LinkedList;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {

		String s="TestYantra";
		char[] ch=s.toCharArray();
		LinkedList<Object> list=new LinkedList<>();
		for(int i=0;i<ch.length;i++) {
			list.add(ch[i]);
		}
		for(Object obj:list) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(obj==(Object)ch[i]) {
				count++;
				
			}
			
		}
			System.out.println(obj+ "--->" +count);
	}

}
}
