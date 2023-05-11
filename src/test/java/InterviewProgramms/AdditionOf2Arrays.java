  package InterviewProgramms;

public class AdditionOf2Arrays {

	public static void main(String[] args) {

		int[] a= {4,3,2,1,3};
		int[] b= {2,4,1,7};
//		int[] c=new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			
//				c[i]=a[i]+b[i];
//				}
//			for(int i=0;i<a.length;i++) {
//				System.out.println(c[i]+ " " );
//				
//			}
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
			
		}
			for(int i=0;i<length;i++) {
				try {
					System.out.print (a[i]+b[i]+ " ");
				}
				catch(Exception e){
					if(a.length<b.length) {
						System.out.println(b[i]);
					}
					else {
						System.out.println(a[i]);
					}
				}
			}
		}
	}

	
