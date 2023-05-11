package PracticeTy;

public class Pattern9 {

	public static void main(String[] args) {
		int n=5;
				;
		int sp=0;
		for(int i=1;i<=n;i++) {//1<5t 2<5t
			
			for(int k=0;k<=sp;k++) {//0<0t 1<1t
				
				System.out.print(" ");
			}
			for(int j=i;j<=2*n-i;j++) { //1<9  2<8
				System.out.print("*");            
												   //* * * * * * * * *
			}									    //
			System.out.println();
			sp++;
		}
	}

}
