package Array;

import java.util.Scanner;
import java.util.Set;

public class DeleteElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		deleteArray(a,3);
	}
	public static void deleteArray(int[] a, int num)
	{
		int[] b=new int[a.length-1];
		if(num<0 && num>a.length) {
	System.out.println("Array index out of bond exception");
		}
		for(int i=0;i<a.length-1;i++) {
			if(i<num) {
				b[i]=a[i];
			}
			else {
				b[i]=a[i+1];
			}
		
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
