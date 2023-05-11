package Array;

import java.util.HashSet;
import java.util.Set;

public class Ipattern {

	public static void main(String[] args) {
		
		int n=8;
		int st=n;
		int sp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<st;j++) {
				
			
			if(i==1||j==(n)/2||j==n||i==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
			System.out.println();
		
		}
	}
}


