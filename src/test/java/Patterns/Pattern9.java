package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			
			for(int j=1;j<=n;j++)//columns
			{
				System.out.print(i+ " ");
				
			}
			System.out.println();
		}
	}

}
