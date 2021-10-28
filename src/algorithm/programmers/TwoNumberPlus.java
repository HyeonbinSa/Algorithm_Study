package algorithm.programmers;

import java.util.TreeSet;
// Clear 
// 프로그래머스 두 개 뽑아서 더하기 
public class TwoNumberPlus {
	// 배열에서 2개의 숫자를 꺼내 더한 모든 수(중복 x) 배열에 담아 오름차순으로 정렬 
	public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> hs = new TreeSet<Integer>();
        int size = numbers.length;
        for(int i=0; i<size;i++) {
        	for(int j=i+1; j<size;j++) {
        		hs.add(numbers[i]+numbers[j]);
        	}
        }
        int i =0;
        answer = new int[hs.size()];
        for(int j : hs) {
        	answer[i++] = j;
        }
        
        return answer;
    }
}
