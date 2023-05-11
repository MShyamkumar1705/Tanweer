package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
//		1 1 1 1 1 1 
//		1 1 1 1 1 1 
//		1 1 1 1 1 1 
//		1 1 1 1 1 1 
//		1 1 1 1 1 1 
//		1 1 1 1 1 1 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=n;j++)//columns
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
