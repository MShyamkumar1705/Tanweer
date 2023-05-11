package PracticeTy;

public class yuviPattern {

	public static void main(String[] args) {
int n=9;
int sp=n-1;
int st=1;

for(int i=1;i<=2*n-1;i++) {
	for(int j=1;j<=sp;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++) {
		if(j==1||j==st) 
		System.out.print("*");
		
	
		else 
			System.out.print(" ");
	}
	if(i<=(2*n-1)/2) {
		sp--;
		st=st+2;
		
	}
	else {
		sp++;
		st=st-2;
	}
	System.out.println();	

}
	
	}

	}

