package Array;

public class ZigZagArrayOrder {

	public static void main(String[] args) {
		int a[]= {2,3,1,4,8};
		int b[]= {6,7,9,5};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<=c.length;i++) {
			int k=0;
			while(a.length>i && b.length>i) {
				c[k]=a[i]; 					//0 1 2 3 4 5 6 7 8
				k++;					    //2 6 3 7 1 9 4 5 8
				c[k]=b[i];
				k++;
				i++;
			}
			while(a.length>i) {
				c[k]=a[i];
				k++;
				i++;
			}
			while(b.length>i) {
				c[k]=b[i];
				k++;
				i++;
			}
		}
		for(int i=0;i<=c.length;i++) {
			System.out.print  (c[i]+" ");
		}
	}

}
