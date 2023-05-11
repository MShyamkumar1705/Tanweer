package Patterns;

public class PatternChar12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.println(ch++);
			}
			
		}
	}

}
