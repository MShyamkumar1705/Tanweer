package PracticeTy;

public class ReverseString {

	public static void main(String[] args) {
String s="My name name is sam sam";
String[] sh=s.split(" ");
//for(int i=sh.length-1; i>=0;i--) {
//	System.out.print(sh[i]+ " "); //sam sam is name name My 
//}
//System.out.println();
//String rev=" ";
//for(int i=sh.length-1;i>=0;i--) { 
//	rev=rev+sh[i];
//	
//}
//System.out.print(rev+ " "); ////samsamisnamenameMy 
//System.out.println();
//StringBuffer sb=new StringBuffer(s);
//System.out.print(sb.reverse().toString()); //mas mas si eman eman yM
//System.out.println();
//	char[] ch=s.toCharArray();
//	for(int i=ch.length-1;i>=0;i--) {
//		System.out.print(ch[i]);  //mas mas si eman eman yM
//	}
	for(int i=0;i<=sh.length;i++) {
		String st=sh[i];
		//System.out.println(st);
		for(int j=st.length()-1;j>=0;j--) {
			System.out.print(st.charAt(j)+ " ");//y M e m a n e m a n s i m a s m a s
		}
	}
//	System.out.println();
//for(int i=0;i<=sh.length;i++) {
//		String temp=sh[0];
//		sh[0]=sh[sh.length-1];
//		sh[sh.length-1]=temp;
//		System.out.println(sh[i]);
//		
//	}
//	
	}
}
	


