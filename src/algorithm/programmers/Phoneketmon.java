package algorithm.programmers;

import java.util.HashMap;

// Clear 
public class Phoneketmon {
	// 홍박사가 가진 포켓몬 : N마리
	// 가질 수 있는 포켓몬 수 : N/2마리
	// 결과 값 : 가질 수 있는 가장 많은 숫자 
	
	public int solution(int[] nums) {
        int answer = 0;
        int get_count = nums.length/2;
        HashMap<Integer, Integer> monster_number = new HashMap<Integer, Integer>();
        for(int i : nums) {
        	if(monster_number.get(i) == null) {
        		monster_number.put(i, 1);
        	}else {
        		monster_number.put(i, monster_number.get(i)+1);
        	}
        }
        System.out.println(monster_number.size());
        if(get_count < monster_number.size()) {
        	answer = get_count;
        }else {
        	answer = monster_number.size();
        }
        System.out.println(answer);
        return answer;
    }
}
