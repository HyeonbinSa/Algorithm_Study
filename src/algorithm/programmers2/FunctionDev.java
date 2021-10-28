package algorithm.programmers2;

import java.util.ArrayList;

public class FunctionDev {
	
	// 진도가 100%일때 서비스에 반영이  가능 
	// 앞이 배포되기 이전에 뒤에는 완료되어도 배포 불가능 
	
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> queue = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        // 작업 진도율 큐에 입력 
        for(int i=0;i<progresses.length;i++) {
        	queue.add(progresses[i]);
        }
        int progress ; 
        int number = 0;
        int day = 0;
        int count = 0;
        while(!queue.isEmpty()) {
        	System.out.println(queue);
        	// 가장 처음 작업
        	if(day==0) {
        		// 작업의 남은 일 수 
        		day = (int) Math.ceil((double)(100-queue.remove(0))/(double)speeds[number]);
        		count++;
        		number++;
        	}else {
        		// 현재 일수보다 남은 작업 일수가 클 경우 
        		if(day < (int) Math.ceil((double)(100-queue.get(0))/(double)speeds[number])) {
        			result.add(count);
        			day = (int) Math.ceil((double)(100-queue.remove(0))/(double)speeds[number]);
        			count = 1;
        		}else {
        			queue.remove(0);
        			count++;
        		}
        		number++;
        	}
        }
        result.add(count);
        System.out.println(result);
        answer = new int[result.size()];
        int idx=0;
        for(int i : result) {
        	answer[idx++] = i; 
        }
        return answer;
    }	
}
