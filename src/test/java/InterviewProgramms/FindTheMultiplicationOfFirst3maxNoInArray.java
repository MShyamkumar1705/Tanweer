package InterviewProgramms;

public class FindTheMultiplicationOfFirst3maxNoInArray {

	public static void main(String[] args) {
		int[] a= {5,3,2,1};
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
		}
		int multi=1;
		int count=3;
		for(int i=0;i<count;i++) {
			multi=multi*a[i];
		}
		System.out.println("The Multiplication of First 3 maximum no is:" +multi);
	}

}
