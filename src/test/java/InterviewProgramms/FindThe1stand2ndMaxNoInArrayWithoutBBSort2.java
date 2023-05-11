 package InterviewProgramms;

public class FindThe1stand2ndMaxNoInArrayWithoutBBSort2 {

	public static void main(String[] args) {

		int[] a= {5,3,2,1};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=fmax)
				//5<=5t
			{
				if(a[i]!=fmax)
					//5!=5
				{
				smax=fmax;
				}
				fmax=a[i];
			}
			else if(fmax==smax || smax<a[i]) {
				smax=a[i];
			}
			}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
