package Collection_Java;

import java.util.PriorityQueue;

public class Collection_PriorityQueueEx1 {


	public static void main(String[] args) {

		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(20);
		pq.add(40);
		pq.add(7);
		pq.add(5);
		pq.add(80);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
