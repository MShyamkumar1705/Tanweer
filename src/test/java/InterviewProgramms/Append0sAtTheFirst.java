

 package InterviewProgramms;

public class Append0sAtTheFirst {

	public static void main(String[] args) {
		int[] a= {1,0,0,1,0};
		int size=a.length;
		int[] b=new int[size];
		int m=0;
		int n=size-1;
		for(int i=0;i<size;i++) {
			if(a[i]==0) {
				b[m]=a[i];
				m++;
			}else {
					b[n]=a[i];
					n--;
					
				}
			}
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			
			
		}
	}

}
