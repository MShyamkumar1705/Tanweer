package PracticeTy;

public class Pattern3 {

	public static void main(String[] args) {
int n=7;
int sp=n;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=sp;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print("* ");
	}
	System.out.println();
	if(n>i) {
		sp--;
	}
}
	}

}
