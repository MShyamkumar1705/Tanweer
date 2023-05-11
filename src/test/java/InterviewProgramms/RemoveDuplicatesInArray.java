package InterviewProgramms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
		System.out.println(hs);
//		}
//		Iterator<Integer> it=hs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
		}
	}

}
