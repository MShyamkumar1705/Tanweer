package InterviewProgramms;

public class SortAnArrayInAscendingBB {

	public static void main(String[] args) {
		
		int[] a= {5,2,1,3};
		int size=a.length;
		for(int i=0;i<=size;i++)//0<4(true) 1<4(true)
		{
			for(int j=i+1;j<size;j++)//1<4(true)
			{
				if(a[i]>a[j])//5>2t
				{
					int temp=a[i];//5
					a[i]=a[j];    //2
					a[j]=temp;    //5
					
					
				}
			}
			System.out.println(a[i]+  "   ");
		}
	}

}
