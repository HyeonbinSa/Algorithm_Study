package algorithm.programmers;

import java.util.HashMap;

// 실패율 
public class FailureRate {
	
	// 실패율 : 스테이지 도달했으나 클리어하지 못한 플레이어 수 / 스테이지 도달한 수 
	// 전체 스테이지 개수 : N 
	// 현재 사용자가 멈춘 스테이지 번호 담긴 배열 : stages 
	// 결과 배열 : 실패율이 높은 스테이지 -> 내림차순으로 스테이지 번호 배열 
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int[N];
        int user = stages.length;
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        
        // 1. 실패 스테이지 count 
        for(int i : stages) {
        	if(i==N+1) {
        		continue;
        	}
        	stageCount[i-1]++;
        }
        double fr;
        // 2. 실패율 정보 저장 
        for(int i=0;i<N;i++) {
        	if(user == 0) {
        		map.put(i+1, 0.0);
        	}else {
        		fr = (double)stageCount[i] / (double)user;
            	map.put(i+1, fr);
            	user -= stageCount[i]; 
        	}
        }
        System.out.println(map);
        for(int idx=0;idx<N;idx++) {
	        double maxRate = -1.0;
	        int maxStage = 0;
	        for(int i: map.keySet()) {
	        	if(maxRate < map.get(i)) {
	        		maxStage = i;
	        		maxRate = map.get(i);
	        	}
	        }
	        map.remove(maxStage);
	        answer[idx] = maxStage;
        }
        for(int i:answer) {
        	System.out.print(i + ", ");
        }
        return answer;
    }
	
}
