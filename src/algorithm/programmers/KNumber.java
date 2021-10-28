package algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class KNumber {
	// i번째부터 j번째 까지 자른 뒤 정렬 
	// 정렬한 배열에서 k번째 값을 출력 
	// command[]는 [i, j, k] 값을 가지고 있음.
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++) {
        	answer[i] = sortFunc(array, commands[i]);
        	System.out.println(answer[i]);
        }
        return answer;
    }
	
	public int sortFunc(int[] array, int[] command) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int start = command[0];
		int end = command[1];
		int k= command[2];
		for(int i = start-1; i<end ;i++) {
			arr.add(array[i]);
		}
		Collections.sort(arr);
		System.out.println(arr.get(k-1));
		return arr.get(k-1);
	}
}
