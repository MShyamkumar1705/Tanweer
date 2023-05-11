package InterviewProgramms;

public class SortAnArrayInDscendingBB {

	public static void main(String[] args) {
		int a[]= {1,9,10,2,4};
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
