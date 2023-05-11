package InterviewProgramms;

public class FindTheFirstMaximumNoUsingBBSort {

	public static void main(String[] args) {

		int[] a= {5,3,2,1,4};
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		System.out.println("The First Maximum No is:" +a[0]);
	}
}
