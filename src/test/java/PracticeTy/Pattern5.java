package PracticeTy;

public class Pattern5 {

	public static void main(String[] args) {
		int n=4;
		int sp=n;
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(c++ +" ");
				
			}
			System.out.println();
			sp--;
		}
	}

}
