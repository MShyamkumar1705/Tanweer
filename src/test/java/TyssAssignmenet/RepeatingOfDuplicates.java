package TyssAssignmenet;

import java.util.LinkedHashSet;

public class RepeatingOfDuplicates {

	public static void main(String[] args) {

		String s="TestYantra";
		char[] ch=s.toCharArray();
		LinkedHashSet<Object> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
			
		}
		//System.out.println(set);
		for(Object obj:set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
			if(obj.equals(ch[i])) {
				count++;
				if(count>1) {
					
					System.out.println(obj+ "---> " +(i+1)+ " position " +count+ " times");
				}
				
				}
			
			
			}
			
			
		}
		
	}
}


