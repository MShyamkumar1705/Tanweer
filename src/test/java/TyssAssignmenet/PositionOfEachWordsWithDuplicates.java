package TyssAssignmenet;

import java.util.LinkedList;

public class PositionOfEachWordsWithDuplicates {

	public static void main(String[] args) {
String s="I am from from am TestYantra";
		String[] st=s.split(" ");
		LinkedList<Object> list=new LinkedList<>();
		for(int i=0;i<st.length;i++) {
			list.add(st[i]);
		}
		for(Object obj:list) {
			for(int i=0;i<st.length;i++) {
				if(obj==(Object)st[i])
				System.out.println(obj+ " is in " +(i+1)+ " ->Position");
				
			}
			
		}
		
	}
}
	

