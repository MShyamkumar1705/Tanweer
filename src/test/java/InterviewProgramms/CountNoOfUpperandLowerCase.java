package InterviewProgramms;

public class CountNoOfUpperandLowerCase {

	public static void main(String[] args) {

		String s="TestYantra";
		int upperCase=0;
		int lowerCase=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				upperCase++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
					lowerCase++;
				}
			
			}

		System.out.println("Uppercase --->"+upperCase);
		System.out.println("Lowercase --->"+lowerCase);
		}

}
