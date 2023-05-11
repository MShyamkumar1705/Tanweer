package InterviewProgramms;

public class SumOfTwoDigitsInString {

	public static void main(String[] args) {
String a="11d12e3";
//String b="b2v4d6";
int sum1=0;
int sum2=0;
for(int i=0;i<a.length();i++) {
		if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
			int n=a.charAt(i)-48;
			sum2=sum2*10+n;
			}
		else {
			sum1=sum1+sum2;
			sum2=0;
		}
	}
sum1=sum1+sum2;
System.out.println(sum1);
}
	
	}
	
