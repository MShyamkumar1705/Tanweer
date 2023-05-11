package InterviewProgramms;

public class FindTheElementWhichHasMinIntegerLength {

	public static void main(String[] args) {
String[] sh= {"12348","542","7867","1"};
String min=sh[0];
for(int i=0;i<sh.length;i++) {
	if(min.length()>sh[i].length()) {
		min=sh[i];
	}
}
for(int i=0;i<sh.length;i++) {


	if(min.length()==sh[i].length()) {
		min=sh[i];
		System.out.println("minimum Length element is: " +sh[i]);
	}
}

for(int i=0;i<sh.length;i++) {
	if(min.length()<sh[i].length()) {
		min=sh[i];
	}
}
for(int i=0;i<sh.length;i++) {


	if(min.length()==sh[i].length()) {
		min=sh[i];
		System.out.println("maximum Length element is: "  +sh[i]);
	}
}		




}
}

