package Array;

public class BiggestNoInArray {

	public static void main(String[] args) {
		int[] a= {7,5,8,2,1,4,9};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			System.out.print(a[i]+" ");
//		}
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
			
		}
		System.out.println("biggest digit is " +big);
	
	int small=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<small) {
			small=a[i];
		}
		
	}
	System.out.println("smallest digit is " +small);
}
}