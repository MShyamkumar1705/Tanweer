package TyssAssignmenet;

import java.util.LinkedHashSet;

public class PositionOfEachWordsWithoutDuplicates {

	public static void main(String[] args) {

		String s="I am from from am TestYantra";
		String[] st=s.split(" ");
		LinkedHashSet<Object> set=new LinkedHashSet<>();
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		System.out.println(set);
		for(Object obj:set) {
			for(int i=0;i<st.length;i++) {
				if(obj.equals(st[i])) {
					System.out.println(obj+ "--->" +(i+1)+ " Position");
				}
			}
		}
	}

}
