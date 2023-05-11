package InterviewProgramms;

public class Find1stMaxNoInArrayWithoutBBSort {

	public static void main(String[] args) {
		int[] a= {5,3,2,1,6};
		int fmax=a[0];
		for(int i=1;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax=a[i];
				
			}
		}
		System.out.println("The 1st MIN no. in array is:" +fmax);
	}

}
