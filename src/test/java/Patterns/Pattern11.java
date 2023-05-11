package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
//		 5 4 3 2 1 
//		 5 4 3 2 
//		 5 4 3 
//		 5 4 
//		 5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			int k=5;
			for(int j=i;j<=i;j++)//columns
			{
				System.out.print( " ");
				}
			for(int j=i;j<=n;j++)//columns
			{
				System.out.print(k--+ " ");
				}
			System.out.println();
		}
	}

}
