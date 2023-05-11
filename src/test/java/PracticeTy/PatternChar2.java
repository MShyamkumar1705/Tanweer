package PracticeTy;

public class PatternChar2 {

	public static void main(String[] args) {
		int n=6;
		
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			int x=1;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(x+64)+ " ");
			if(i<=j) {
				x++;
			}
			else {
				x--;
			}
			System.out.println();
			
			}
	}

	}
}
