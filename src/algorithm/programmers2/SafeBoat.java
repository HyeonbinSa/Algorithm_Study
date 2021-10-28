package algorithm.programmers2;

import java.util.ArrayList;
import java.util.Arrays;

public class SafeBoat {
	// 최대 2명 
	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int  i=people.length-1;i>=0;i--) {
//        	list.add(people[i]);
//        }
//        
//        while(!list.isEmpty()) {
//        	if(list.size() == 1) {
//        		answer++;
//        		list.remove(0);
//        	}else {
//        		if(list.get(0)+list.get(list.size()-1) <= limit) {
//        			answer++;
//        			list.remove(0);
//        			list.remove(list.size()-1);
//        		}else {
//        			answer++;
//        			list.remove(0);
//        		}
//        	}
//        }
        int idx = 0;
        for(int i=people.length-1;i>=0;i--) {
        	if(people.length==1) {
        		answer++;
        	}else {
        		if(people[i] + people[idx] <= limit) {
        			idx++;
        		}
        		answer++;
        	}
        	if(idx>=i) {
        		break;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
