package Array;

import java.util.Scanner;

public class InsertNewElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=5;
		int[] a= {1,2,3,4,5};
		insertElement(a,2,b);
	}
	public static void insertElement(int[] a,int num,int b) {
		int c[]=new int[a.length+1];
		if(num<0 && num>a.length) {
			
			System.out.println("Array index Out of bOnd");
		}
		for(int i=0;i<a.length;i++) {
			if(num>i) {
				c[i]=a[i];
			}
			 else if (num==i){
				 c[i]=b;
				
				}
			 else {
				 c[i]=a[i-1];
			 }
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+" ");
		}
	}

}
