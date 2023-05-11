package TyssAssignmenet;

import java.util.LinkedList;

public class FindThePositionsOfCharacter {

	public static void main(String[] args) {

		String s="TestYantra";
		char[] ch=s.toCharArray();
		LinkedList<Object> list=new LinkedList<>();
		for(int i=0;i<ch.length;i++) {
			list.add(ch[i]);
			
		}
		System.out.println(list);
		for(Object obj:list) {
			for(int i=0;i<ch.length;i++) {
				if(obj==(Object)ch[i]) {
					System.out.println(ch[i]+ " is in " +(i+1)+ " ->Position");
					break;
			}
		}
	}

	}
}
