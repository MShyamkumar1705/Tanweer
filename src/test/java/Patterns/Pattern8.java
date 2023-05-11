package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			int count=1;
			for(int j=1;j<=n;j++)//columns
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
	}

}
