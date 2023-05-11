package PracticeTy;

public class Pattern8 {

	public static void main(String[] args) {
		int n=6;
		int sp=n-1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			sp--;
		}
	}

}
