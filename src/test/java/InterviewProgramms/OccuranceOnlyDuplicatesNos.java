package InterviewProgramms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOnlyDuplicatesNos {

	public static void main(String[] args) {

		int[] a= {2,3,2,1,3,2};
		Set<Object> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
		}
		for(Object obj:hs) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(obj==(Object)a[i]) {
					count++;
					
				}
				
				
			}
			System.out.println(obj+ "-----> "+count);
		}
	}
}
