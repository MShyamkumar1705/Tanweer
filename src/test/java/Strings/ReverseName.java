package Strings;

import java.util.Iterator;

public class ReverseName {

	public static void main(String[] args) {
String st="Shyam Kumar";
String[] sh=st.split(" ");
String s=sh[1]+sh[0];
System.out.println(s);

char[] ch=new char[s.length()];
for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
if(i%2==0) 
	ch[i]=s.charAt(i);
}
System.out.println();
for (int j = ch.length-1; j >=0 ; j--) {
	//System.out.println("");
	System.out.print(ch[j]);
}
	
//char[] ch=new char[s.length()];
//for(int i=0;i<s.length();i++) {
//	if(i%2==0)
//		ch[i]=s.charAt(i);
//}
//for(int j=0;j<ch.length;j++) {
//	System.out.println(ch[j]);
//}



	
}
}	


