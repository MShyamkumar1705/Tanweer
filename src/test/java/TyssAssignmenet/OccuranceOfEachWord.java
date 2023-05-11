package TyssAssignmenet;

import java.util.LinkedList;

public class OccuranceOfEachWord {

	public static void main(String[] args) {

		String s="I am from from am TestYantra";
		String[] st=s.split(" ");
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<st.length;i++) {
			list.add(st[i]);	
		}
		for(Object obj:list) {
			int count=0;
			for(int i=0;i<st.length;i++) {
				if(obj.equals(st[i])) {
					count++;
				}
			}
			System.out.println(obj+ "--->" +count);
		}
		
	}

}
