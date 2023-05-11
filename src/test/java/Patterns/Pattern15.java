package Patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int n=7;
		int st=1;
		int sp=(n/2);
		
		for (int i=0; i <n; i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<st;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2) {
				st=st+2;
				sp--;
			}
			else {
				st=st-2;
				sp++;
			}
			
		}

	}

}
