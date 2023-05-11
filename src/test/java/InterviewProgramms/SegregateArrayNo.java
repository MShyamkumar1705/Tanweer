package InterviewProgramms;

import java.util.HashSet;

public class SegregateArrayNo {

	public static void main(String[] args) {
int[] a= {1,0,1,1};
int count=0;
HashSet<Object> set=new HashSet<>();
for(int j=0;j<=a.length;j++) {
	set.add(a[j]);
}
for(Object obj:set) {
for(int i=0;i<=a.length;i++) {
	if(obj.equals(0)) {
		count++;
	}
	System.out.println(a[i]+ "  " +count);
}
	}

	}
}
