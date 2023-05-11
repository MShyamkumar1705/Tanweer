package TyssAssignmenet;

import java.util.LinkedHashSet;

public class RepeatingOfDuplicatesInString {

	public static void main(String[] args) {

		String s="I am from from am TestYantra";
		String[] st=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		System.out.println(set);
		
		for(String obj:set) {
			int count=0;
			for(int i=0;i<st.length;i++) {
				if(obj.equals(st[i])) {
					count++;
				}		
			}
			if(count>1) {
				//System.out.println(obj+ " "+(i+1)+ " position");
				System.out.println(obj+ "--->" +count);
			}
		}
	}

}
