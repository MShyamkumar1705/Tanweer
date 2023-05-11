package TyssAssignmenet;

import java.util.LinkedHashSet;

public class ReverseAString {

	public static void main(String[] args) {

//	1.	String s="Welcome to to Bengaluru Bengaluru"; //bengaluru bengaluru to to welcome
//		String st=s.toLowerCase();
//		String[] sh=st.split(" ");
//		for(int i=sh.length-1;i>=0;i--) {
//			System.out.print(sh[i]+ " ");
//        }
		
//	2.	String s="Welcome to to Bengaluru Bengaluru"; //urulagneb urulagneb ot ot emoclew
//		String st=s.toLowerCase();
//		 char[] ch=st.toCharArray();
//		 for(int i=ch.length-1;i>=0;i--) {
//			 System.out.print(ch[i]+ "");
//		 }
		 
//	3.	String s="Welcome to to Bengaluru Bengaluru"; //Bengaluru Bengaluru to to Welcome
//		String[] sh=s.split(" ");
//		String rev=" ";
//		for(int i=sh.length-1;i>=0;i--) {
//			rev=rev+sh[i]+" ";
//		}
//			 System.out.print(rev+ " ");
		
//	4.	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		String s=sc.nextLine();
//		String[] st=s.split(s);
//		for(int i=st.length-1;i>=0;i--) {
//			System.out.println(st[i]);
//		}
		 
//	5.	 String s="Welcome to  Bengaluru"; //emoclew ot  urulagneb
//			String st=s.toLowerCase();
//			 String[] sh=st.split(" ");
//			 
//			 for(int i=0;i<sh.length;i++)  {
//				 String str=sh[i];
//				 for(int j=str.length()-1;j>=0;j--) {
//					 System.out.print(str.charAt(j));
//				 }
//				 System.out.print(" ");
//			 }
		
//	6.	 String s="Welcome to city Bengaluru";
//		 String[] st=s.split(" ");
//		 String temp = st[0];
//		 st[0]=st[st.length-1];
//		 st[st.length-1]=temp;
//		for(int i=0;i<st.length;i++) {
//			System.out.println(st[i]);
//		 
//		 
//		}
		
//	7.	String s="TestYantra";
//		char[] ch=s.toCharArray();
//		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
//		for(int i=0;i<ch.length;i++) {
//			set.add(ch[i]);
//		}
//		for(Character obj:set) {
//			int count=0;
//			for(int i=0;i<ch.length;i++) {
//				if(obj.equalsIgnoreCase(ch[i])) {
//					count++;
//				}
//			}
//			System.out.println(obj+ "--->" +count);
//		}
		
		String s="Welcome to city to Bangalore";
		String[] st=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		for(String obj:set) {
			int count=0;
			for(int i=0;i<st.length;i++) {
				if(obj.equalsIgnoreCase(st[i])) {
					count++;
				}
			}
			System.out.println(obj+ "--->" +count);
		}
		 }
		
	}

