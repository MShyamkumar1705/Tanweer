package InterviewProgramms;

public class FirstAndSecond {

	public static void main(String[] args) {
int[]a= {5,2,1,3};
int fmin=a[0];
for(int i=1;i<a.length;i++)
{
	if(fmin>a[i])
	{
		fmin=a[i];
	}
}
System.out.println("First min number is = "+fmin);
//System.out.println("second min number is = "+);
	}

}
