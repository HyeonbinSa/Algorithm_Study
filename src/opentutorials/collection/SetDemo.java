package opentutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(3);
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(3);
		AL.add(3);
		AL.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.print(hi.next()+", ");
		}
		System.out.println();
		Iterator hi2 = (Iterator) AL.iterator();
		while(hi2.hasNext()) {
			System.out.print(hi2.next()+", ");
		}
		System.out.println();
		
		System.out.println(A.containsAll(B));
		System.out.println(A.containsAll(C));
		
		A.addAll(B); // 합집합
		A.retainAll(B); // 교집합 
		A.removeAll(B); // 차집합 
		
	}

}
