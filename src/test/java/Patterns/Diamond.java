package Patterns;

public class Diamond {

	public static void main(String[] args) {
		int n=9;
		int sp=0;
		int st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for (int j =0; j <st; j++) {
				System.out.print("*");
				
			}
			for(int k=1;k<=st;k++) {
				System.out.print("*");
			}
				if(i<=n/2) {
					sp--;
					st=st-2;
					
				}
				else {
					sp++;
					st=st+2;
				}

				System.out.println();
			}
			
		}
	}


