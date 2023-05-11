package Patterns;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class pattern14 {

	public static void main(String[] args) {
	
		int n=9;
		int st=1;
		int sp=n/2;
		int sp1=0;
		for (int i = 1; i <n-1; i++) {
			for (int j =1; j <=sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=st; k++) {
			System.out.print("*");	
			}
			for (int j = 1; j <=sp1; j++) {
				System.out.print(" ");
			}
			for (int j =0; j <st; j++) {
				System.out.print("*");
			}
			if(i<n/2) {
				sp--;
				sp1=sp1+2;
			}
			else {
				sp++;
				sp1=sp1-2;
			}
			System.out.println();
		}
	}

}
