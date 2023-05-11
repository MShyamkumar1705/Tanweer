package InterviewProgramms;

import java.util.LinkedHashSet;

public class OccuranceEachNosInArray {

	public static void main(String[] args) {

		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
for (Integer integer : hs) {
	System.out.println(integer);
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(integer==a[i]) {
			count++;
		}
	}
	System.out.print(integer+ "============ " +count);
}
	}
}
