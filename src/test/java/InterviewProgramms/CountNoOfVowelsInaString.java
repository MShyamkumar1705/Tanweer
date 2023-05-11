package InterviewProgramms;

import java.util.LinkedHashSet;

public class CountNoOfVowelsInaString {

	public static void main(String[] args) {

		String s="TestYantra";
		String us=s.toUpperCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<us.length();i++) {
			set.add(us.charAt(i));
		}
		int count=0;
		for(Character obj:set) {
			if(obj=='A'||obj=='E'||obj=='I'||obj=='O'||obj=='U'&& obj=='a'||obj=='e'||obj=='i'||obj=='o'||obj=='u' ) {
				count++;
				System.out.println(obj);
			}
		}
		System.out.println("The Number of vowels in a String are= "+count);
	}

}
