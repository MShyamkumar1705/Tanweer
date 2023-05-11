package PracticeTy;

public class Pattern7 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=n-1;j++) {
				System.out.print(j-c);
				if(j%2==0) {
					c++;
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
