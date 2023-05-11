package Patterns;

import java.util.Iterator;
import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
		int n=5;
		int st=1;
		int sp=n-1;
		int p=1;
		for (int i=0; i<n; i++) {
			for (int j = 0; j<sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <st; j++) {
				System.out.print( "*" );
				//System.out.print(".");
			}

			System.out.println();
			if(i<=n) {
				sp--;
				st=st+2;
				//st++;
				//p++;
				
			}
			else {
				sp++;
				//st--;
				st=st-2;
				//p--;
				
			}
		}
		
		

	}

}
