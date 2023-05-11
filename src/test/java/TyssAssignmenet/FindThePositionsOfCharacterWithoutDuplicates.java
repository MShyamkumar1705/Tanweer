package TyssAssignmenet;

import java.util.HashSet;

public class FindThePositionsOfCharacterWithoutDuplicates {

	public static void main(String[] args) {
String s="TestYantra";
char[] ch=s.toCharArray();
HashSet<Object> set=new HashSet<Object>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
	}
System.out.println(set);
	for(Object obj:set) {
		for(int i=0;i<ch.length;i++) {
			if(obj==(Object)ch[i]) {
				System.out.println(ch[i]+ " is in " +(i+1)+ " ->Position");
				break;

}
		}
	}
	}
}
			
