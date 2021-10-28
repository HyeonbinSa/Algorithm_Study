package algorithm.programmers2;

import java.util.Arrays;
import java.util.HashMap;

public class RenewalMenu {
	// 단품으로만 제공하던 메뉴를 조합하여 코스요리로 재구성
	// 가장 많이 함께 주문한 담품메뉴들 
	
	// orders : 손님들이 주문한 담품메뉴 배열
	// course : 코스요리를 구성하는 단품메뉴 갯수가 담긴 배열
	public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int courseNumber;
        // 1. 각 order 오름차순 정렬 
        for(int i=0; i<orders.length;i++) {
        	String[] arr = orders[i].split("");
        	Arrays.sort(arr);
        	orders[i] = String.join("", arr);
        }
        // 2. 코스 조합 개수별로 조합 생
        for(int i=0; i<course.length;i++) {
        	courseNumber = course[i];
        	for(int j=0; j<orders.length; j++) {
//        		System.out.println(orders[j]);
        		this.combi(hm, orders[j], courseNumber, "");
        	}
        }
        
        // 3. 최대값 구하기 
        int max = Integer.MIN_VALUE;
        for(String key : hm.keySet()) {
        	if(hm.get(key) > max) {
        		max = hm.get(key);
        	}
        }
        for(String key : hm.keySet()) {
        	if(hm.get(key) ==  max) {
        		System.out.println("String : " + key +", value : "+ hm.get(key));
        	}
        }
//        System.out.println(hm);
        return answer;
    }
	// 1. 각 order별 조합 
	public void combi(HashMap<String, Integer> hm, String order, int course, String str) {
		if(str.equals("ACD")) {
			System.out.println(str);
		}
		
		if(str.length() == course) {
			if(hm.get(str) != null ) {
				hm.put(str, hm.get(str)+1);
			}else {
				hm.put(str, 1);
			}
			return;
		}
		// order 조합 중 
		int idx = -1;
		if(str.length() > 0) {
			idx = order.indexOf(str.charAt(str.length()-1));
		}
		for(int i=idx+1; i<order.length();i++) {
			this.combi(hm, order, course, str+order.charAt(i));
		}
	}
}
