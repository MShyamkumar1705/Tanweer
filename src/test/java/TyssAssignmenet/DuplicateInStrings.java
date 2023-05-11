package TyssAssignmenet;

import java.util.HashSet;

public class DuplicateInStrings {

	public static void main(String[] args) {
String s="My name is is Shyam Shyam";
String[] sh=s.split(" ");
HashSet<String> set=new HashSet<>();
for(int i=0;i<sh.length;i++) {
	set.add(sh[i]);
}
for(String obj:set) {
	
	int count=0;
	for(int i=0;i<sh.length;i++) {
		
		if(obj.equalsIgnoreCase(sh[i])) {
			count++;
			if(count>1) {
			
		}
		
	}
	
	
}
	System.out.println(obj+   +count);
	}

	}
}
