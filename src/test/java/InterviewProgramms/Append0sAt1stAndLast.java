package InterviewProgramms;

public class Append0sAt1stAndLast {

	public static void main(String[] args) {
		int[] a= {1,0,0,1,0};
		int size=a.length;
		for(int i=0;i<size;i++) {
			if(a[i]==0) {
				size=a[i];
				System.out.println(size);
				
			}
		}
	}

}
