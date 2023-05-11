package PracticeTy;

public class ExtractNo {

	public static void main(String[] args) {
		String s="test1235jsj3";
//		String digits=s.replaceAll("[^a-z]","");
//		System.out.println(digits);
		
		
		String num=" ";
		for(int i=0;i<s.length()-1;i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
		}
		
	}
		System.out.println(num);
}
}