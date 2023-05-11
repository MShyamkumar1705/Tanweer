package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
//		1 2 3 4 5 6 
//		2 3 4 5 6 
//		3 4 5 6 
//		4 5 6 
//		5 6 
//		6
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			
			for(int j=i;j<=n;j++)//columns
			{
				System.out.print(j+ " ");
				
			}
			System.out.println();
		}
	}

}
