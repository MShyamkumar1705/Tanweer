	package InterviewProgramms;

import java.util.LinkedHashSet;

public class FindThePositionOfEachNosInArray {

	public static void main(String[] args) {

		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer in:set) {
			for(int i=0;i<a.length;i++) {
				if(in==a[i]) {
					System.out.println(a[i]+ "is in" +(i+1)+ "Position");
					break;
				}
			}
		}
	}

}
