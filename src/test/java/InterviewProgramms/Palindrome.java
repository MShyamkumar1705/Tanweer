package InterviewProgramms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Word");
		String st=sc.nextLine();
//		StringBuffer sb=new StringBuffer(st);
//		String sh=sb.reverse().toString();
//		if(sh.equals(st)) {
//			System.out.println(st+ " is palindrome");
//		}
//		else {
//			System.out.println("Not a palindrome");
//		}
		 
//		String[] sh=st.split(" ");
//		for(int i=sh.length-1;i>=0;i--) {
//			System.out.println(sh[i]);
//		if(st.equals(sh[i])) {
//			System.out.println(st+ " is palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//		}
		
		String[] sh=st.split(" ");
		String rev=" ";
		for(int i=sh.length-1;i>=0;i--) {
			rev=rev+sh[i];
			System.out.println(rev);
		}
		if(st.equals(rev)) {
			System.out.println(st+ " is palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
	}


