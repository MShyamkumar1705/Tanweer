package InterviewProgramms;

public class FindTheSumOfFirst3maxNoInArray2 {

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
			//System.out.println(a[size-1]);
		}
		int sum=0;
		int count=3;
		for(int i=0;i<count;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of First 3 maximum no is:" +sum);
	}

}
