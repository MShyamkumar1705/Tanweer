package InterviewProgramms;

public class SumOfDigitsInAString {

	public static void main(String[] args) {

		String s="b2v4d6";
		int num=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				num=num+s.charAt(i)-48;
				
			}
			
		}
		System.out.println(num);
	}

}
 