package Array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int i1=0;i1<a.length;i1++) {
			System.out.print(a[i1]+ " ");
		}
	}
	
	

}
