package Strings;

public class Rev {

	public static void main(String[] args) {
		String s="Shyam kumar";
		String[] sh=s.split(" ");
		String rev=" ";
		for(int i=sh.length-1;i>=0;i--) {
			rev=rev+sh[i];
		}
		System.out.println(rev);
String st=rev.toString();
		char[] ch=new char[st.length()];
		for (int i =st.length()-1; i>=0; i--) {
			if(i%2==0) 
				ch[i]=st.charAt(i);
			}
			for (int j = 0; j<=ch.length-1 ; j++) {
				//System.out.println("");
				System.out.print(ch[j]);
			}
			
		}
	}
	
	

