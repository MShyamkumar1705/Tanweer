package PracticeTy;

public class YuviString {

	public static void main(String[] args) {
String s="AUTOMATION TESTING";
//char[] ch=s.toCharArray();
//for(int i=s.length()-1;i>=0;i--) {
//	System.out.println(ch[i]);
//}

String[] st=s.split(" "); //N O I T A M O T U A  G N I T S E T
for(int i=0;i<=st.length;i++) {
	String sh = st[i];
for(int j=sh.length()-1;j>=0;j--) {
	System.out.print(sh.charAt(j)+ " ");
}
}

	}

}
