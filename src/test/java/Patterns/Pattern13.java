package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int sp=n+1/2;
int st=1;
for(int i=1;i<=n;i++) {
	{
		for(int j=1;j<=sp;j++) {
			
			System.out.print(" ");
		}
			for(int k=1;k<=st;k++) {
				System.out.print("*");
			}
			System.out.println();
				sp--;
				st=st+2;
			
}
}
}
}