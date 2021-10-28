package algorithm.programmers;


// 모의고사 
public class ExcersiseExam {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] st1 = {1, 2, 3, 4, 5}; // 5
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        
        int size = answers.length;
        
        int[] score = {0,0,0};
        for(int i=0;i<size;i++) {
        	if(st1[i%5] == answers[i]) score[0]++;
        	if(st2[i%8] == answers[i]) score[1]++;
        	if(st3[i%10] == answers[i]) score[2]++;
        }
        
        int max = -1;
        int maxIdx = -1;
        int count = 0;
        for(int i=0;i<3;i++) {
        	if(max < score[i]) {
        		max = score[i];
        		maxIdx = i;
        	}else if(max == score[i]) {
        		count++;
        	}
        }
        int idx = 0;
        // 최대 맞은 개수가  동일한게 없을 경우
        if(count == 0) {
        	answer = new int[] {maxIdx+1};
        }
        // 최대 맞은 개수가 동일한게 있을 경우 
        else {
        	answer = new int[count+1];
        	for(int i=maxIdx;i<3;i++) {
        		if(score[maxIdx] == score[i]) {
        			answer[idx++] = i+1;
        		}
        	}
        }
        for(int i: answer) {
        	System.out.print(i+", ");
        }
        return answer;
    }
}
