package NewReverseStrings;

public class Revs {

	public static void main(String[] args) {
		String s="Shyam kumar";
		String[] sh=s.split(" ");
		
		for(int i=0;i<=sh.length-1;i++) {
			String st=sh[i];
			String rev=" ";
			for (int j =st.length()-1; j>=0; j--) {
				rev=rev+st.charAt(j);
			}
			System.out.print(rev);
		}
	}

}
