package InterviewProgramms;

public class HowManyVc_Cc_Uc_Lc_Dc_Special_digits {

	public static void main(String[] args) {

		String s="TestYantra";
		int vc=0,uc=0,cc=0,lc=0,dc=0,spe=0;
        for(int i=0;i<s.length();i++) {
	    char ch=s.charAt(i);
	    if(ch>='A'&&ch<='Z') {
	    	
	    	uc++;
	    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
	    	vc++;
	    	System.out.println("No.Of Upper Vowels are: "+vc);
	    }
	    else {
	    	cc++;
	    	System.out.println("No. of Upper Consonant are: "+cc);
	    }
	    }
        }
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
	    if(ch>='a'&&ch<='z') {
	    	lc++;
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	    	vc++;
	    	System.out.println("No.Of Smaller Vowels are: "+vc);
	    }
	    else {
	    	cc++;
	    	System.out.println("No. of Smaller Consonant are: "+cc);
	    }
	    }
        }
	}
}
