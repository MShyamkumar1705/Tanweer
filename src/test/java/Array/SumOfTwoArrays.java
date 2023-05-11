package Array;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		//int c[]=new int[a.length+b.length];
		int length=a.length;
		if(length<b.length) {
		length=b.length;
		}
		for(int i=0;i<length;i++) {
			try {
				//int sum=a[i]+b[i];
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.print(a[i]+" ");
			}
				else {
					System.out.print(b[i]+" ");
				}
			
		}
		}
	}
	}

