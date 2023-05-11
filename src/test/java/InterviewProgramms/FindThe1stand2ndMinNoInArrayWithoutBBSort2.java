package InterviewProgramms;

public class FindThe1stand2ndMinNoInArrayWithoutBBSort2 {

	public static void main(String[] args) {

		int[] a= {5,3,2,1};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=fmin)
				//5<=5t
			{
				if(a[i]!=fmin)
					//5!=5
				{
				smin=fmin;
				}
				fmin=a[i];
			}
			else if(fmin==smin || smin>a[i]) {
				smin=a[i];
			}
			}
		System.out.println(fmin);
		System.out.println(smin);
	}
	
}

