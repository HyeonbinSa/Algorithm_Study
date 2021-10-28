package opentutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "One";
		arrayObj[1] = "Two";
		//arrayObj[2] = "Three"; //Array의 단점, 오류 발생 
		for(int i=0;i<arrayObj.length;i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		for(int i=0;i<al.size();i++) {
			//String value = al.get(i); // 에러가 발생함, add(인자)에 들어가는 인자가 Object 데이터 타입으로 저장되어 발생하는 에러 .
			String value = (String)al.get(i);
			System.out.println(value);
		}
		ArrayList<String> list = new ArrayList<String>();//Generic을 통한 명시
		
	}

}

/*
 * 컬레션즈 프레임워크란?
 * 가장 큰 구성 
 * - Collection과 Map 
 * - Collection의 카테고리
 *   - Set
 *     - HashSet
 *     - LinkedHashSet
 *     - TreeSet
 *   - List
 *     - ArrayList
 *     - Vector
 *     - LinkedList
 *   _ Queue
 *     - PriorityQueue
 *     
 * - Map의 카테고리
 *   - SortedMap
 *     - TreeMap
 *   - HashTable
 *   - LinkedHashMap
 *   - HashMap
 */
