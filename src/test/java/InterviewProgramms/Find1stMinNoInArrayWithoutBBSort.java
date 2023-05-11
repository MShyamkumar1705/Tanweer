package InterviewProgramms;

import java.util.ArrayList;

public class Find1stMinNoInArrayWithoutBBSort {

	public static void main(String[] args) {

		int[] a= {5,2,1,3};
		int fmin=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
				
				
			}
			
			
		}
		
		System.out.println("The 1st min no. in array is:" +fmin);
	}

}
