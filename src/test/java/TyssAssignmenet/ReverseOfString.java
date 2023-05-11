package TyssAssignmenet;

public class ReverseOfString {

	public static void main(String[] args) {

		String s="TestYantra";
		String ss="TestYantra";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
		
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]);
		}
		
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			System.out.println(ch[i]);
		}
		
		int count=0;
		for(char c:ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		}
	
	

}
