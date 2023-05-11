package TyssAssignmenet;

import java.util.Scanner;

public class PatternAssignment1 {

	public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the digit");
//int n=sc.nextInt();
int n=4;
int k=1;
for(int i=1;i<=n;i++) {//1<4t 2<4 3<4
	
	for(int j=1;j<=i;j++){//1<1t 1<2t,2<2t 1<4t,2<4t
		System.out.print(k+" ");//1 
		k++;//2					//2 3
		//if					//4 5 6
	}
	System.out.println();

}
	}

}
