package PracticeTy;

public class SwapString {

	public static void main(String[] args) {
		String s="Shyam";
		char ch[]=s.toCharArray();
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
	}

}
