package Array;

public class PrimeNoInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=1;i<a.length;i++) {
		//	int temp=a[i];
			if(a[i]%i==0 ) {
				System.out.println(a[i]);
				//i++;
			}
			
			
		}
	}

}
