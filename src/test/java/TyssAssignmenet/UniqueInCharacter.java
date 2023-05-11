package TyssAssignmenet;

import java.util.LinkedHashSet;

public class UniqueInCharacter {

	public static void main(String[] args) {

		String s="TestYantra";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			set.add(st.charAt(i));
		}
		for(Character ch:set) {
			System.out.println(ch);
		}
	}

}
