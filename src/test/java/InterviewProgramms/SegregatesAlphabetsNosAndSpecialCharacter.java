package InterviewProgramms;

import java.util.Scanner;

public class SegregatesAlphabetsNosAndSpecialCharacter {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
		String s=sc.next();
		String alpha = " ";
		String num = " ";
		String spc = " ";
	
		for(int i=0;i<s.length()-1;i++) {
			System.out.println(s.charAt(i));
			
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
			alpha=alpha+s.charAt(i);
	}
		else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			num=num+s.charAt(i);
		}else {
			spc=spc+s.charAt(i);
			
		}
}
		System.out.println("Alphabets are:"+alpha);
		System.out.println("Numbers:"+num);
		System.out.println(" Specials Characters: "+spc);
	}
}



