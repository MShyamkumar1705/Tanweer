package Array;

public class AscendingANdDescending {

	public static void main(String[] args) 
	{
			
		int[] a= {1,2,5,3,6,7,1,8,9,4};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];  //0=2
					a[i]=a[j];     //a[i]=1
					a[j]=temp;     //a[j]=2  
				
				}
				b[i]=a[i];
			}
		
			System.out.print(b[i]+" ");
			int k=0;
			int l=b.length-1;
			while(b.length>k) {
				int len=a[k];
				b[k]=a[l];
				b[l]=len;
			}
			for (int j = 0; j <b.length; j++) {
				System.out.println(b[j]);
			}
		
		
		
	
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]<a[j]) {
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		
//		System.out.println(a[i]+" ");
//	}
	}
}
}