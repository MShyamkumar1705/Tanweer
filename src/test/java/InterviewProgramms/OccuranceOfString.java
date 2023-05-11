package InterviewProgramms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOfString {

	public static void main(String[] args) {

		String s="SShhyam";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		Set<Object> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		for(Object obj:set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(obj==(Object)ch[i]) {
					count++;
				}
			}
			System.out.println(obj+ "----->  "  +count);
		}
	}

}
