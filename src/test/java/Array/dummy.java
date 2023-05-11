package Array;

public class dummy {

	public static void main(String[] args) {
		int[] a={2,4,7,6};
		int[] b=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j =i+1; j < b.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		b[i]=a[i];
			System.out.println(a[i]);
			
		}
		int max=a[0];
		for (int i =0; i < b.length; i++) {
			if(max<b[i]) {
				max=b[i];
			}
			
		}
		System.out.println("\n");
		System.out.println(max);
	}

}
